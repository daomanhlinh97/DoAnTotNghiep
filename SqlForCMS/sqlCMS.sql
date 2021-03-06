USE [master]
GO
/****** Object:  Database [CMS]    Script Date: 31/03/2019 6:55:58 CH ******/
CREATE DATABASE [CMS]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CMS', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\CMS.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'CMS_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\CMS_log.ldf' , SIZE = 2048KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [CMS] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CMS].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CMS] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CMS] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CMS] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CMS] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CMS] SET ARITHABORT OFF 
GO
ALTER DATABASE [CMS] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CMS] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [CMS] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CMS] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CMS] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CMS] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CMS] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CMS] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CMS] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CMS] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CMS] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CMS] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CMS] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CMS] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CMS] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CMS] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CMS] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CMS] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CMS] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [CMS] SET  MULTI_USER 
GO
ALTER DATABASE [CMS] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CMS] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CMS] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CMS] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [CMS]
GO
/****** Object:  Table [dbo].[Content]    Script Date: 31/03/2019 6:55:58 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Page](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Alias] [nvarchar](255) NULL,
	[Icon] [nvarchar](255) NULL,
	[Is_Container] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[History]    Script Date: 31/03/2019 6:55:58 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[History](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Parent_Id] [bigint] NULL,
	[Content_Change] [nvarchar](4000) NULL,
	[Author] [nvarchar](255) NULL,
	[Date] [datetime2](7) NULL,
	[Status] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Sort]    Script Date: 31/03/2019 6:55:58 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Sort](
	[Parent_Id] [bigint] NOT NULL,
	[Child_Id] [bigint] NOT NULL,
	[Allowed_Id] [bigint] NOT NULL,
	[Content] [nvarchar](4000) NULL,
	[Sort_Order] [int] NULL,
	[Type] [nvarchar](255) NULL
PRIMARY KEY CLUSTERED 
(
	[Allowed_Id] ASC,
	[Child_Id] ASC,
	[Parent_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]


--home
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Home_Content](
	[No] [bigint] IDENTITY(1,1) NOT NULL,
	[Id] [bigint],
	[Header] [nvarchar](500) NULL,
	[Description] [nvarchar](500) NULL,
	[Caption] [nvarchar](255) NULL,
	[Address] [nvarchar](255) NULL,
	[Font] [nvarchar](255) NULL,
	[Color_Theme] [nvarchar](255) NULL,
	[Site_Name] [nvarchar](255) NULL,
	[Logo] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

--product content page
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product_Content](
	[No] [bigint] IDENTITY(1,1) NOT NULL,
	[Id] [bigint],
	[Page_Title] [nvarchar](100) NULL,
	[Description] [nvarchar](500) NULL,
	[Keywords] [nvarchar](100) NULL,
	[Is_Hide] [bit] NULL,
	[Default_Currency] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


--product item
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product_Item](
	[No] [bigint] IDENTITY(1,1) NOT NULL,
	[Id] [bigint],
	[Product_Name] [nvarchar](100) NULL,
	[Price] [float] NULL,
	[Category] [nvarchar](100) NULL,
	[Description] [nvarchar](500) NULL,
	[Sku] [nvarchar](255) NULL,
	[Photos] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


--Amount item of product
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product_Amount](
	[No] [bigint] IDENTITY(1,1) NOT NULL,
	[Id] [bigint],
	[Name] [nvarchar](100) NULL,
	[Details] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

----People
--SET ANSI_NULLS ON
--GO
--SET QUOTED_IDENTIFIER ON
--GO
--CREATE TABLE [dbo].[People](
--	[No] [bigint] IDENTITY(1,1) NOT NULL,
--	[Id] [bigint],
--	[Description] [nvarchar](500) NULL,
--	[Keywords] [nvarchar](100) NULL,
--	[Is_Hide] [bit] NULL,
--	[Photos] [nvarchar](100) NULL,
--	[Department] [nvarchar](100) NULL,
--	[Twitter_UserName] [nvarchar](100) NULL,
--	[Facebook_Username] [nvarchar](100) NULL,
--	[LinkedIn_Username] [nvarchar](100) NULL,
--	[Instagram_Username] [nvarchar](100) NULL,
--PRIMARY KEY CLUSTERED 
--(
--	[No] ASC
--)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
--) ON [PRIMARY]
--GO

--About us
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Aboutus](
	[No] [bigint] IDENTITY(1,1) NOT NULL,
	[Id] [bigint],
	[Page_Title] [nvarchar](100) NULL,
	[Description] [nvarchar](500) NULL,
	[Keywords] [nvarchar](255) NULL,
	[Is_Hide] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


--Blog Page content
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Blog_Content](
	[No] [bigint] IDENTITY(1,1) NOT NULL,
	[Id] [bigint],
	[Page_Title] [nvarchar](100) NULL,
	[Description] [nvarchar](500) NULL,
	[Keywords] [nvarchar](100) NULL,
	[Is_Hide] [bit] NULL,
	[Post_Show] [int] NULL,
	[Disqus_Shortname] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


--Blog item
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Blog_Item](
	[No] [bigint] IDENTITY(1,1) NOT NULL,
	[Id] [bigint],
	[Description] [nvarchar](500) NULL,
	[Keywords] [nvarchar](255) NULL,
	[Is_Hide] [bit] NULL,
	[Page_Title] [nvarchar](100) NULL,
	[Categories] [nvarchar](255) NULL,
	[Excerpt] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


--Contact
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contact](
	[No] [bigint] IDENTITY(1,1) NOT NULL,
	[Id] [bigint],
	[Description] [nvarchar](500) NULL,
	[Keywords] [nvarchar](255) NULL,
	[Is_Hide] [bit] NULL,
	[Page_Title] [nvarchar](100) NULL,
	[Contact_Form_Header] [nvarchar](255) NULL,
	[Contact_Intro] [nvarchar](500) NULL,
	[Pick_Contact_Form] [nvarchar](100) NULL,
	[Map_Header] [nvarchar](100) NULL,
	[Map_Coordinates] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


--User
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](255) NULL,
	[Email] [nvarchar](255) NULL,
	[Is_Admin] [bit] NULL,
	[Is_Editor] [bit] NULL,
	[Is_Sensitive] [bit] NULL,
	[Is_Translators] [bit] NULL,
	[Is_Writers] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

--Member
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Member](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Comments] [nvarchar](255) NULL,
	[Failed_Password] [nvarchar](255) NULL,
	[Is_Approved] [bit] NULL,
	[Is_Locked] [bit] NULL,
	[Last_Lockout_Date] [datetime2](7) NULL,
	[Last_Login_Date] [datetime2](7) NULL,
	[Last_Passwordchange_Date] [datetime2](7) NULL,
	[Member_Type] [nvarchar](255) NULL,
	[Login] [nvarchar](255) NULL,
	[Email] [nvarchar](255) NULL,
	[Password] [nvarchar](255) NULL,
	[Member_Group] [nvarchar](255) NULL,
	[Password_Answer] [nvarchar](255) NULL,
	[Password_Question] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO



SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[History]  WITH CHECK ADD  CONSTRAINT [FK_History_Page] FOREIGN KEY([Parent_Id])
REFERENCES [dbo].[Page] ([Id])
GO
ALTER TABLE [dbo].[History] CHECK CONSTRAINT [FK_History_Page]
GO
ALTER TABLE [dbo].[Sort]  WITH CHECK ADD  CONSTRAINT [FK_Sort_Page] FOREIGN KEY([Parent_Id])
REFERENCES [dbo].[Page] ([Id])
GO
ALTER TABLE [dbo].[Sort] CHECK CONSTRAINT [FK_Sort_Page]
GO
ALTER TABLE [dbo].[Home_Content]  WITH CHECK ADD  CONSTRAINT [FK_HomeContent_Page] FOREIGN KEY([Id])
REFERENCES [dbo].[Page] ([Id])
GO
ALTER TABLE [dbo].[Product_Content]  WITH CHECK ADD  CONSTRAINT [FK_Product_Content_Page] FOREIGN KEY([Id])
REFERENCES [dbo].[Page] ([Id])
GO
ALTER TABLE [dbo].[Product_Item]  WITH CHECK ADD  CONSTRAINT [FK_Product_Item_Page] FOREIGN KEY([Id])
REFERENCES [dbo].[Page] ([Id])
GO
ALTER TABLE [dbo].[Product_Amount]  WITH CHECK ADD  CONSTRAINT [FK_ProductAmount_Page] FOREIGN KEY([Id])
REFERENCES [dbo].[Page] ([Id])
GO
--ALTER TABLE [dbo].[People]  WITH CHECK ADD  CONSTRAINT [FK_Pepple_Page] FOREIGN KEY([Id])
--REFERENCES [dbo].[Page] ([Id])
--GO
ALTER TABLE [dbo].[Aboutus]  WITH CHECK ADD  CONSTRAINT [FK_Aboutus_Page] FOREIGN KEY([Id])
REFERENCES [dbo].[Page] ([Id])
GO
ALTER TABLE [dbo].[Blog_Content]  WITH CHECK ADD  CONSTRAINT [FK_Blog_Content_Page] FOREIGN KEY([Id])
REFERENCES [dbo].[Page] ([Id])
GO
ALTER TABLE [dbo].[Blog_Item]  WITH CHECK ADD  CONSTRAINT [FK_Blog_Item_Page] FOREIGN KEY([Id])
REFERENCES [dbo].[Page] ([Id])
GO
ALTER TABLE [dbo].[Contact]  WITH CHECK ADD  CONSTRAINT [FK_Contact_Page] FOREIGN KEY([Id])
REFERENCES [dbo].[Page] ([Id])
GO
USE [master]
GO
ALTER DATABASE [CMS] SET  READ_WRITE 
GO
