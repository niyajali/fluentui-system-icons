/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons

import androidx.compose.ui.graphics.vector.ImageVector
import fluent.ui.system.icons.color.AddCircle
import fluent.ui.system.icons.color.AddStarburst
import fluent.ui.system.icons.color.Agents
import fluent.ui.system.icons.color.Alert
import fluent.ui.system.icons.color.AlertBadge
import fluent.ui.system.icons.color.AlertUrgent
import fluent.ui.system.icons.color.AnimalPawPrint
import fluent.ui.system.icons.color.ApprovalsApp
import fluent.ui.system.icons.color.Apps
import fluent.ui.system.icons.color.AppsList
import fluent.ui.system.icons.color.AppsListDetail
import fluent.ui.system.icons.color.ArrowClockwiseDashes
import fluent.ui.system.icons.color.ArrowClockwiseDashesSettings
import fluent.ui.system.icons.color.ArrowSquare
import fluent.ui.system.icons.color.ArrowSquareDown
import fluent.ui.system.icons.color.ArrowSync
import fluent.ui.system.icons.color.ArrowTrendingLines
import fluent.ui.system.icons.color.Beach
import fluent.ui.system.icons.color.Board
import fluent.ui.system.icons.color.Book
import fluent.ui.system.icons.color.BookContacts
import fluent.ui.system.icons.color.BookDatabase
import fluent.ui.system.icons.color.BookOpen
import fluent.ui.system.icons.color.BookOpenLightbulb
import fluent.ui.system.icons.color.BookStar
import fluent.ui.system.icons.color.Bookmark
import fluent.ui.system.icons.color.Bot
import fluent.ui.system.icons.color.BotSparkle
import fluent.ui.system.icons.color.Briefcase
import fluent.ui.system.icons.color.Building
import fluent.ui.system.icons.color.BuildingGovernment
import fluent.ui.system.icons.color.BuildingGovernmentSearch
import fluent.ui.system.icons.color.BuildingHome
import fluent.ui.system.icons.color.BuildingMultiple
import fluent.ui.system.icons.color.BuildingPeople
import fluent.ui.system.icons.color.BuildingStore
import fluent.ui.system.icons.color.Calendar
import fluent.ui.system.icons.color.CalendarCancel
import fluent.ui.system.icons.color.CalendarCheckmark
import fluent.ui.system.icons.color.CalendarClock
import fluent.ui.system.icons.color.CalendarDataBar
import fluent.ui.system.icons.color.CalendarEdit
import fluent.ui.system.icons.color.CalendarSync
import fluent.ui.system.icons.color.Camera
import fluent.ui.system.icons.color.Certificate
import fluent.ui.system.icons.color.ChartMultiple
import fluent.ui.system.icons.color.Chat
import fluent.ui.system.icons.color.ChatAdd
import fluent.ui.system.icons.color.ChatBubblesQuestion
import fluent.ui.system.icons.color.ChatMore
import fluent.ui.system.icons.color.ChatMultiple
import fluent.ui.system.icons.color.Checkbox
import fluent.ui.system.icons.color.CheckboxPerson
import fluent.ui.system.icons.color.CheckmarkCircle
import fluent.ui.system.icons.color.CircleMultipleHintCheckmark
import fluent.ui.system.icons.color.Clipboard
import fluent.ui.system.icons.color.ClipboardTask
import fluent.ui.system.icons.color.ClipboardTextEdit
import fluent.ui.system.icons.color.Clock
import fluent.ui.system.icons.color.ClockAlarm
import fluent.ui.system.icons.color.Cloud
import fluent.ui.system.icons.color.CloudDismiss
import fluent.ui.system.icons.color.CloudWords
import fluent.ui.system.icons.color.Code
import fluent.ui.system.icons.color.CodeBlock
import fluent.ui.system.icons.color.CoinMultiple
import fluent.ui.system.icons.color.Comment
import fluent.ui.system.icons.color.CommentMultiple
import fluent.ui.system.icons.color.ContactCard
import fluent.ui.system.icons.color.ContentView
import fluent.ui.system.icons.color.DataArea
import fluent.ui.system.icons.color.DataBarVerticalAscending
import fluent.ui.system.icons.color.DataLine
import fluent.ui.system.icons.color.DataPie
import fluent.ui.system.icons.color.DataScatter
import fluent.ui.system.icons.color.DataTrending
import fluent.ui.system.icons.color.Database
import fluent.ui.system.icons.color.DesignIdeas
import fluent.ui.system.icons.color.DismissCircle
import fluent.ui.system.icons.color.Diversity
import fluent.ui.system.icons.color.Document
import fluent.ui.system.icons.color.DocumentAdd
import fluent.ui.system.icons.color.DocumentEdit
import fluent.ui.system.icons.color.DocumentFolder
import fluent.ui.system.icons.color.DocumentLock
import fluent.ui.system.icons.color.DocumentText
import fluent.ui.system.icons.color.Drafts
import fluent.ui.system.icons.color.Edit
import fluent.ui.system.icons.color.ErrorCircle
import fluent.ui.system.icons.color.FastForwardCircle
import fluent.ui.system.icons.color.Flag
import fluent.ui.system.icons.color.Food
import fluent.ui.system.icons.color.Form
import fluent.ui.system.icons.color.GameChat
import fluent.ui.system.icons.color.Gauge
import fluent.ui.system.icons.color.Gift
import fluent.ui.system.icons.color.GiftCard
import fluent.ui.system.icons.color.Globe
import fluent.ui.system.icons.color.GlobeShield
import fluent.ui.system.icons.color.Guest
import fluent.ui.system.icons.color.Headphones
import fluent.ui.system.icons.color.Headset
import fluent.ui.system.icons.color.Heart
import fluent.ui.system.icons.color.History
import fluent.ui.system.icons.color.Home
import fluent.ui.system.icons.color.Image
import fluent.ui.system.icons.color.ImageOff
import fluent.ui.system.icons.color.Laptop
import fluent.ui.system.icons.color.LayerDiagonalPerson
import fluent.ui.system.icons.color.Library
import fluent.ui.system.icons.color.Lightbulb
import fluent.ui.system.icons.color.LightbulbCheckmark
import fluent.ui.system.icons.color.LightbulbFilament
import fluent.ui.system.icons.color.Link
import fluent.ui.system.icons.color.LinkMultiple
import fluent.ui.system.icons.color.ListBar
import fluent.ui.system.icons.color.LocationRipple
import fluent.ui.system.icons.color.LockClosed
import fluent.ui.system.icons.color.LockShield
import fluent.ui.system.icons.color.Mail
import fluent.ui.system.icons.color.MailAlert
import fluent.ui.system.icons.color.MailClock
import fluent.ui.system.icons.color.MailMultiple
import fluent.ui.system.icons.color.MegaphoneLoud
import fluent.ui.system.icons.color.Mic
import fluent.ui.system.icons.color.Molecule
import fluent.ui.system.icons.color.News
import fluent.ui.system.icons.color.Notebook
import fluent.ui.system.icons.color.NotebookQuestionMark
import fluent.ui.system.icons.color.NumberSymbolSquare
import fluent.ui.system.icons.color.Options
import fluent.ui.system.icons.color.Org
import fluent.ui.system.icons.color.PaintBrush
import fluent.ui.system.icons.color.Patient
import fluent.ui.system.icons.color.Paw
import fluent.ui.system.icons.color.People
import fluent.ui.system.icons.color.PeopleAdd
import fluent.ui.system.icons.color.PeopleChat
import fluent.ui.system.icons.color.PeopleCommunity
import fluent.ui.system.icons.color.PeopleHome
import fluent.ui.system.icons.color.PeopleInterwoven
import fluent.ui.system.icons.color.PeopleList
import fluent.ui.system.icons.color.PeopleSync
import fluent.ui.system.icons.color.PeopleTeam
import fluent.ui.system.icons.color.Person
import fluent.ui.system.icons.color.PersonAdd
import fluent.ui.system.icons.color.PersonAvailable
import fluent.ui.system.icons.color.PersonEdit
import fluent.ui.system.icons.color.PersonFeedback
import fluent.ui.system.icons.color.PersonHeart
import fluent.ui.system.icons.color.PersonKey
import fluent.ui.system.icons.color.PersonStarburst
import fluent.ui.system.icons.color.PersonTentative
import fluent.ui.system.icons.color.PersonWarning
import fluent.ui.system.icons.color.Phone
import fluent.ui.system.icons.color.PhoneLaptop
import fluent.ui.system.icons.color.Pin
import fluent.ui.system.icons.color.Planet
import fluent.ui.system.icons.color.Poll
import fluent.ui.system.icons.color.Premium
import fluent.ui.system.icons.color.PuzzlePiece
import fluent.ui.system.icons.color.QuestionCircle
import fluent.ui.system.icons.color.Receipt
import fluent.ui.system.icons.color.Reward
import fluent.ui.system.icons.color.Ribbon
import fluent.ui.system.icons.color.RibbonStar
import fluent.ui.system.icons.color.Savings
import fluent.ui.system.icons.color.ScanPerson
import fluent.ui.system.icons.color.ScanType
import fluent.ui.system.icons.color.SearchSparkle
import fluent.ui.system.icons.color.SearchVisual
import fluent.ui.system.icons.color.Send
import fluent.ui.system.icons.color.SendClock
import fluent.ui.system.icons.color.Settings
import fluent.ui.system.icons.color.ShareAndroid
import fluent.ui.system.icons.color.ShareIOs
import fluent.ui.system.icons.color.Shield
import fluent.ui.system.icons.color.ShieldCheckmark
import fluent.ui.system.icons.color.Shifts
import fluent.ui.system.icons.color.SlideTextSparkle
import fluent.ui.system.icons.color.Sport
import fluent.ui.system.icons.color.Star
import fluent.ui.system.icons.color.StarSettings
import fluent.ui.system.icons.color.Table
import fluent.ui.system.icons.color.TextBulletListSquare
import fluent.ui.system.icons.color.TextBulletListSquareSparkle
import fluent.ui.system.icons.color.TextEditStyle
import fluent.ui.system.icons.color.Toolbox
import fluent.ui.system.icons.color.Trophy
import fluent.ui.system.icons.color.Vault
import fluent.ui.system.icons.color.Video
import fluent.ui.system.icons.color.Warning
import fluent.ui.system.icons.color.WeatherSnowflake
import fluent.ui.system.icons.color.WeatherSunnyLow
import fluent.ui.system.icons.color.WiFiWarning
import fluent.ui.system.icons.color.Wifi
import fluent.ui.system.icons.color.Wrench
import fluent.ui.system.icons.color.WrenchScrewdriver

public val FluentIcons.ColorIconList: List<ImageVector>
    get() {
        if (colorIcons != null) {
            return colorIcons!!
        }

        colorIcons = listOf(
            FluentIcons.Color.AddCircle,
            FluentIcons.Color.AddStarburst,
            FluentIcons.Color.Agents,
            FluentIcons.Color.Alert,
            FluentIcons.Color.AlertBadge,
            FluentIcons.Color.AlertUrgent,
            FluentIcons.Color.AnimalPawPrint,
            FluentIcons.Color.ApprovalsApp,
            FluentIcons.Color.Apps,
            FluentIcons.Color.AppsList,
            FluentIcons.Color.AppsListDetail,
            FluentIcons.Color.ArrowClockwiseDashes,
            FluentIcons.Color.ArrowClockwiseDashesSettings,
            FluentIcons.Color.ArrowSquare,
            FluentIcons.Color.ArrowSquareDown,
            FluentIcons.Color.ArrowSync,
            FluentIcons.Color.ArrowTrendingLines,
            FluentIcons.Color.Beach,
            FluentIcons.Color.Board,
            FluentIcons.Color.Book,
            FluentIcons.Color.BookContacts,
            FluentIcons.Color.BookDatabase,
            FluentIcons.Color.BookOpen,
            FluentIcons.Color.BookOpenLightbulb,
            FluentIcons.Color.BookStar,
            FluentIcons.Color.Bookmark,
            FluentIcons.Color.Bot,
            FluentIcons.Color.BotSparkle,
            FluentIcons.Color.Briefcase,
            FluentIcons.Color.Building,
            FluentIcons.Color.BuildingGovernment,
            FluentIcons.Color.BuildingGovernmentSearch,
            FluentIcons.Color.BuildingHome,
            FluentIcons.Color.BuildingMultiple,
            FluentIcons.Color.BuildingPeople,
            FluentIcons.Color.BuildingStore,
            FluentIcons.Color.Calendar,
            FluentIcons.Color.CalendarCancel,
            FluentIcons.Color.CalendarCheckmark,
            FluentIcons.Color.CalendarClock,
            FluentIcons.Color.CalendarDataBar,
            FluentIcons.Color.CalendarEdit,
            FluentIcons.Color.CalendarSync,
            FluentIcons.Color.Camera,
            FluentIcons.Color.Certificate,
            FluentIcons.Color.ChartMultiple,
            FluentIcons.Color.Chat,
            FluentIcons.Color.ChatAdd,
            FluentIcons.Color.ChatBubblesQuestion,
            FluentIcons.Color.ChatMore,
            FluentIcons.Color.ChatMultiple,
            FluentIcons.Color.Checkbox,
            FluentIcons.Color.CheckboxPerson,
            FluentIcons.Color.CheckmarkCircle,
            FluentIcons.Color.CircleMultipleHintCheckmark,
            FluentIcons.Color.Clipboard,
            FluentIcons.Color.ClipboardTask,
            FluentIcons.Color.ClipboardTextEdit,
            FluentIcons.Color.Clock,
            FluentIcons.Color.ClockAlarm,
            FluentIcons.Color.Cloud,
            FluentIcons.Color.CloudDismiss,
            FluentIcons.Color.CloudWords,
            FluentIcons.Color.Code,
            FluentIcons.Color.CodeBlock,
            FluentIcons.Color.CoinMultiple,
            FluentIcons.Color.Comment,
            FluentIcons.Color.CommentMultiple,
            FluentIcons.Color.ContactCard,
            FluentIcons.Color.ContentView,
            FluentIcons.Color.DataArea,
            FluentIcons.Color.DataBarVerticalAscending,
            FluentIcons.Color.DataLine,
            FluentIcons.Color.DataPie,
            FluentIcons.Color.DataScatter,
            FluentIcons.Color.DataTrending,
            FluentIcons.Color.Database,
            FluentIcons.Color.DesignIdeas,
            FluentIcons.Color.DismissCircle,
            FluentIcons.Color.Diversity,
            FluentIcons.Color.Document,
            FluentIcons.Color.DocumentAdd,
            FluentIcons.Color.DocumentEdit,
            FluentIcons.Color.DocumentFolder,
            FluentIcons.Color.DocumentLock,
            FluentIcons.Color.DocumentText,
            FluentIcons.Color.Drafts,
            FluentIcons.Color.Edit,
            FluentIcons.Color.ErrorCircle,
            FluentIcons.Color.FastForwardCircle,
            FluentIcons.Color.Flag,
            FluentIcons.Color.Food,
            FluentIcons.Color.Form,
            FluentIcons.Color.GameChat,
            FluentIcons.Color.Gauge,
            FluentIcons.Color.Gift,
            FluentIcons.Color.GiftCard,
            FluentIcons.Color.Globe,
            FluentIcons.Color.GlobeShield,
            FluentIcons.Color.Guest,
            FluentIcons.Color.Headphones,
            FluentIcons.Color.Headset,
            FluentIcons.Color.Heart,
            FluentIcons.Color.History,
            FluentIcons.Color.Home,
            FluentIcons.Color.Image,
            FluentIcons.Color.ImageOff,
            FluentIcons.Color.Laptop,
            FluentIcons.Color.LayerDiagonalPerson,
            FluentIcons.Color.Library,
            FluentIcons.Color.Lightbulb,
            FluentIcons.Color.LightbulbCheckmark,
            FluentIcons.Color.LightbulbFilament,
            FluentIcons.Color.Link,
            FluentIcons.Color.LinkMultiple,
            FluentIcons.Color.ListBar,
            FluentIcons.Color.LocationRipple,
            FluentIcons.Color.LockClosed,
            FluentIcons.Color.LockShield,
            FluentIcons.Color.Mail,
            FluentIcons.Color.MailAlert,
            FluentIcons.Color.MailClock,
            FluentIcons.Color.MailMultiple,
            FluentIcons.Color.MegaphoneLoud,
            FluentIcons.Color.Mic,
            FluentIcons.Color.Molecule,
            FluentIcons.Color.News,
            FluentIcons.Color.Notebook,
            FluentIcons.Color.NotebookQuestionMark,
            FluentIcons.Color.NumberSymbolSquare,
            FluentIcons.Color.Options,
            FluentIcons.Color.Org,
            FluentIcons.Color.PaintBrush,
            FluentIcons.Color.Patient,
            FluentIcons.Color.Paw,
            FluentIcons.Color.People,
            FluentIcons.Color.PeopleAdd,
            FluentIcons.Color.PeopleChat,
            FluentIcons.Color.PeopleCommunity,
            FluentIcons.Color.PeopleHome,
            FluentIcons.Color.PeopleInterwoven,
            FluentIcons.Color.PeopleList,
            FluentIcons.Color.PeopleSync,
            FluentIcons.Color.PeopleTeam,
            FluentIcons.Color.Person,
            FluentIcons.Color.PersonAdd,
            FluentIcons.Color.PersonAvailable,
            FluentIcons.Color.PersonEdit,
            FluentIcons.Color.PersonFeedback,
            FluentIcons.Color.PersonHeart,
            FluentIcons.Color.PersonKey,
            FluentIcons.Color.PersonStarburst,
            FluentIcons.Color.PersonTentative,
            FluentIcons.Color.PersonWarning,
            FluentIcons.Color.Phone,
            FluentIcons.Color.PhoneLaptop,
            FluentIcons.Color.Pin,
            FluentIcons.Color.Planet,
            FluentIcons.Color.Poll,
            FluentIcons.Color.Premium,
            FluentIcons.Color.PuzzlePiece,
            FluentIcons.Color.QuestionCircle,
            FluentIcons.Color.Receipt,
            FluentIcons.Color.Reward,
            FluentIcons.Color.Ribbon,
            FluentIcons.Color.RibbonStar,
            FluentIcons.Color.Savings,
            FluentIcons.Color.ScanPerson,
            FluentIcons.Color.ScanType,
            FluentIcons.Color.SearchSparkle,
            FluentIcons.Color.SearchVisual,
            FluentIcons.Color.Send,
            FluentIcons.Color.SendClock,
            FluentIcons.Color.Settings,
            FluentIcons.Color.ShareAndroid,
            FluentIcons.Color.ShareIOs,
            FluentIcons.Color.ShareIOs,
            FluentIcons.Color.Shield,
            FluentIcons.Color.ShieldCheckmark,
            FluentIcons.Color.Shifts,
            FluentIcons.Color.SlideTextSparkle,
            FluentIcons.Color.Sport,
            FluentIcons.Color.Star,
            FluentIcons.Color.StarSettings,
            FluentIcons.Color.Table,
            FluentIcons.Color.TextBulletListSquare,
            FluentIcons.Color.TextBulletListSquareSparkle,
            FluentIcons.Color.TextEditStyle,
            FluentIcons.Color.Toolbox,
            FluentIcons.Color.Trophy,
            FluentIcons.Color.Vault,
            FluentIcons.Color.Video,
            FluentIcons.Color.Warning,
            FluentIcons.Color.WeatherSnowflake,
            FluentIcons.Color.WeatherSunnyLow,
            FluentIcons.Color.WiFiWarning,
            FluentIcons.Color.Wifi,
            FluentIcons.Color.WiFiWarning,
            FluentIcons.Color.Wrench,
            FluentIcons.Color.WrenchScrewdriver
        )

        return colorIcons!!
    }

private var colorIcons: List<ImageVector>? = null