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
import fluent.ui.system.icons.light.AccessibilityCheckmark
import fluent.ui.system.icons.light.Add
import fluent.ui.system.icons.light.Alert
import fluent.ui.system.icons.light.AppFolder
import fluent.ui.system.icons.light.AppGeneric
import fluent.ui.system.icons.light.Archive
import fluent.ui.system.icons.light.ArchiveSettings
import fluent.ui.system.icons.light.ArrowClockwise
import fluent.ui.system.icons.light.ArrowDown
import fluent.ui.system.icons.light.ArrowDownload
import fluent.ui.system.icons.light.ArrowForward
import fluent.ui.system.icons.light.ArrowHookDownLeft
import fluent.ui.system.icons.light.ArrowHookDownRight
import fluent.ui.system.icons.light.ArrowHookUpLeft
import fluent.ui.system.icons.light.ArrowHookUpRight
import fluent.ui.system.icons.light.ArrowRedo
import fluent.ui.system.icons.light.ArrowReply
import fluent.ui.system.icons.light.ArrowReplyAll
import fluent.ui.system.icons.light.ArrowUndo
import fluent.ui.system.icons.light.Attach
import fluent.ui.system.icons.light.AutoFit
import fluent.ui.system.icons.light.AutoFitWidth
import fluent.ui.system.icons.light.Autocorrect
import fluent.ui.system.icons.light.BreakoutRoom
import fluent.ui.system.icons.light.Broom
import fluent.ui.system.icons.light.Calendar3Day
import fluent.ui.system.icons.light.CalendarClock
import fluent.ui.system.icons.light.CalendarDataBar
import fluent.ui.system.icons.light.CalendarDay
import fluent.ui.system.icons.light.CalendarEdit
import fluent.ui.system.icons.light.CalendarEmpty
import fluent.ui.system.icons.light.CalendarLtr
import fluent.ui.system.icons.light.CalendarMonth
import fluent.ui.system.icons.light.CalendarMultiple
import fluent.ui.system.icons.light.CalendarPattern
import fluent.ui.system.icons.light.CalendarReply
import fluent.ui.system.icons.light.CalendarSparkle
import fluent.ui.system.icons.light.CalendarTodo
import fluent.ui.system.icons.light.CalendarWorkWeek
import fluent.ui.system.icons.light.Chat
import fluent.ui.system.icons.light.Checkmark
import fluent.ui.system.icons.light.CheckmarkCircle
import fluent.ui.system.icons.light.Classification
import fluent.ui.system.icons.light.ClipboardPaste
import fluent.ui.system.icons.light.Clock
import fluent.ui.system.icons.light.ClockAlarm
import fluent.ui.system.icons.light.Color
import fluent.ui.system.icons.light.ColorFill
import fluent.ui.system.icons.light.ColorFillAccent
import fluent.ui.system.icons.light.Comment
import fluent.ui.system.icons.light.CommentAdd
import fluent.ui.system.icons.light.Compose
import fluent.ui.system.icons.light.Copy
import fluent.ui.system.icons.light.Crop
import fluent.ui.system.icons.light.Cursor
import fluent.ui.system.icons.light.Cut
import fluent.ui.system.icons.light.Delete
import fluent.ui.system.icons.light.Dismiss
import fluent.ui.system.icons.light.DismissCircle
import fluent.ui.system.icons.light.Document
import fluent.ui.system.icons.light.DocumentLightning
import fluent.ui.system.icons.light.DocumentSignature
import fluent.ui.system.icons.light.DocumentSparkle
import fluent.ui.system.icons.light.DoorArrowRight
import fluent.ui.system.icons.light.Edit
import fluent.ui.system.icons.light.Emoji
import fluent.ui.system.icons.light.Eye
import fluent.ui.system.icons.light.EyeOff
import fluent.ui.system.icons.light.Filter
import fluent.ui.system.icons.light.Flag
import fluent.ui.system.icons.light.FlagOff
import fluent.ui.system.icons.light.Flash
import fluent.ui.system.icons.light.FolderArrowRight
import fluent.ui.system.icons.light.FolderMail
import fluent.ui.system.icons.light.HandDraw
import fluent.ui.system.icons.light.History
import fluent.ui.system.icons.light.ImageAdd
import fluent.ui.system.icons.light.ImageAltText
import fluent.ui.system.icons.light.ImageCopy
import fluent.ui.system.icons.light.ImageReflection
import fluent.ui.system.icons.light.ImageShadow
import fluent.ui.system.icons.light.ImmersiveReader
import fluent.ui.system.icons.light.Important
import fluent.ui.system.icons.light.Lasso
import fluent.ui.system.icons.light.LayoutColumnTwo
import fluent.ui.system.icons.light.LayoutColumnTwoFocusLeft
import fluent.ui.system.icons.light.LayoutColumnTwoFocusRight
import fluent.ui.system.icons.light.LayoutRowTwo
import fluent.ui.system.icons.light.LayoutRowTwoFocusTop
import fluent.ui.system.icons.light.LayoutRowTwoFocusTopSettings
import fluent.ui.system.icons.light.LayoutRowTwoSettings
import fluent.ui.system.icons.light.Lightbulb
import fluent.ui.system.icons.light.Link
import fluent.ui.system.icons.light.LockClosed
import fluent.ui.system.icons.light.LockOpen
import fluent.ui.system.icons.light.Mail
import fluent.ui.system.icons.light.MailAlert
import fluent.ui.system.icons.light.MailArrowClockwise
import fluent.ui.system.icons.light.MailArrowDoubleBack
import fluent.ui.system.icons.light.MailCopy
import fluent.ui.system.icons.light.MailEdit
import fluent.ui.system.icons.light.MailList
import fluent.ui.system.icons.light.MailMultiple
import fluent.ui.system.icons.light.MailRead
import fluent.ui.system.icons.light.MailReadMultiple
import fluent.ui.system.icons.light.MailRewind
import fluent.ui.system.icons.light.MailSettings
import fluent.ui.system.icons.light.MailTemplate
import fluent.ui.system.icons.light.MailUnread
import fluent.ui.system.icons.light.Mic
import fluent.ui.system.icons.light.Molecule
import fluent.ui.system.icons.light.Note
import fluent.ui.system.icons.light.Options
import fluent.ui.system.icons.light.PaintBrush
import fluent.ui.system.icons.light.PanelLeftDefault
import fluent.ui.system.icons.light.PanelLeftFocusRight
import fluent.ui.system.icons.light.PenSparkle
import fluent.ui.system.icons.light.People
import fluent.ui.system.icons.light.PeopleAdd
import fluent.ui.system.icons.light.PeopleCommunity
import fluent.ui.system.icons.light.PeopleEdit
import fluent.ui.system.icons.light.PeopleList
import fluent.ui.system.icons.light.PeopleSettings
import fluent.ui.system.icons.light.PeopleSync
import fluent.ui.system.icons.light.Person
import fluent.ui.system.icons.light.PersonAdd
import fluent.ui.system.icons.light.PersonAvailable
import fluent.ui.system.icons.light.PersonFeedback
import fluent.ui.system.icons.light.PersonMail
import fluent.ui.system.icons.light.PersonProhibited
import fluent.ui.system.icons.light.PersonSuport
import fluent.ui.system.icons.light.PersonSupport
import fluent.ui.system.icons.light.Phone
import fluent.ui.system.icons.light.PictureInPicture
import fluent.ui.system.icons.light.Pin
import fluent.ui.system.icons.light.PinOff
import fluent.ui.system.icons.light.Poll
import fluent.ui.system.icons.light.Print
import fluent.ui.system.icons.light.Question
import fluent.ui.system.icons.light.ReadAloud
import fluent.ui.system.icons.light.RectangleLandscape
import fluent.ui.system.icons.light.RotateLeft
import fluent.ui.system.icons.light.Save
import fluent.ui.system.icons.light.SendClock
import fluent.ui.system.icons.light.Settings
import fluent.ui.system.icons.light.Share
import fluent.ui.system.icons.light.ShieldError
import fluent.ui.system.icons.light.Signature
import fluent.ui.system.icons.light.SpeakerMute
import fluent.ui.system.icons.light.SquareArrowForward
import fluent.ui.system.icons.light.Stamp
import fluent.ui.system.icons.light.StarAdd
import fluent.ui.system.icons.light.StarArrowRight
import fluent.ui.system.icons.light.Sticker
import fluent.ui.system.icons.light.TabAdd
import fluent.ui.system.icons.light.Table
import fluent.ui.system.icons.light.TableAltText
import fluent.ui.system.icons.light.TableCellsMerge
import fluent.ui.system.icons.light.TableCellsSplit
import fluent.ui.system.icons.light.TableDismiss
import fluent.ui.system.icons.light.TableMoveAbove
import fluent.ui.system.icons.light.TableMoveBelow
import fluent.ui.system.icons.light.TableMoveLeft
import fluent.ui.system.icons.light.TableMoveRight
import fluent.ui.system.icons.light.TableSettings
import fluent.ui.system.icons.light.TableSimple
import fluent.ui.system.icons.light.Tag
import fluent.ui.system.icons.light.Text
import fluent.ui.system.icons.light.TextBoxAlignTopLeft
import fluent.ui.system.icons.light.TextClearFormatting
import fluent.ui.system.icons.light.TextCollapse
import fluent.ui.system.icons.light.TextDensity
import fluent.ui.system.icons.light.TextEditStyle
import fluent.ui.system.icons.light.TextExpand
import fluent.ui.system.icons.light.TextBoxAlignTopLeft
import fluent.ui.system.icons.light.Toolbox
import fluent.ui.system.icons.light.Translate
import fluent.ui.system.icons.light.Video
import fluent.ui.system.icons.light.VideoClip
import fluent.ui.system.icons.light.WeatherMoon
import fluent.ui.system.icons.light.WeatherSunny
import fluent.ui.system.icons.light.Window
import fluent.ui.system.icons.light.WrenchScrewdriver
import fluent.ui.system.icons.light.ZoomIn
import fluent.ui.system.icons.light.ZoomOut

public val FluentIcons.LightIconList: List<ImageVector>
    get() {
        if (lightIcons != null) {
            return lightIcons!!
        }

        lightIcons = listOf(
            FluentIcons.Light.AccessibilityCheckmark,
            FluentIcons.Light.Add,
            FluentIcons.Light.Alert,
            FluentIcons.Light.AppFolder,
            FluentIcons.Light.AppGeneric,
            FluentIcons.Light.Archive,
            FluentIcons.Light.ArchiveSettings,
            FluentIcons.Light.ArrowClockwise,
            FluentIcons.Light.ArrowDown,
            FluentIcons.Light.ArrowDownload,
            FluentIcons.Light.ArrowForward,
            FluentIcons.Light.ArrowHookDownLeft,
            FluentIcons.Light.ArrowHookDownRight,
            FluentIcons.Light.ArrowHookUpLeft,
            FluentIcons.Light.ArrowHookUpRight,
            FluentIcons.Light.ArrowRedo,
            FluentIcons.Light.ArrowReply,
            FluentIcons.Light.ArrowReplyAll,
            FluentIcons.Light.ArrowUndo,
            FluentIcons.Light.Attach,
            FluentIcons.Light.AutoFit,
            FluentIcons.Light.AutoFitWidth,
            FluentIcons.Light.Autocorrect,
            FluentIcons.Light.BreakoutRoom,
            FluentIcons.Light.Broom,
            FluentIcons.Light.Calendar3Day,
            FluentIcons.Light.CalendarClock,
            FluentIcons.Light.CalendarDataBar,
            FluentIcons.Light.CalendarDay,
            FluentIcons.Light.CalendarEdit,
            FluentIcons.Light.CalendarEmpty,
            FluentIcons.Light.CalendarLtr,
            FluentIcons.Light.CalendarMonth,
            FluentIcons.Light.CalendarMultiple,
            FluentIcons.Light.CalendarPattern,
            FluentIcons.Light.CalendarReply,
            FluentIcons.Light.CalendarSparkle,
            FluentIcons.Light.CalendarTodo,
            FluentIcons.Light.CalendarWorkWeek,
            FluentIcons.Light.Chat,
            FluentIcons.Light.Checkmark,
            FluentIcons.Light.CheckmarkCircle,
            FluentIcons.Light.Classification,
            FluentIcons.Light.ClipboardPaste,
            FluentIcons.Light.Clock,
            FluentIcons.Light.ClockAlarm,
            FluentIcons.Light.Color,
            FluentIcons.Light.ColorFill,
            FluentIcons.Light.ColorFillAccent,
            FluentIcons.Light.Comment,
            FluentIcons.Light.CommentAdd,
            FluentIcons.Light.Compose,
            FluentIcons.Light.Copy,
            FluentIcons.Light.Crop,
            FluentIcons.Light.Cursor,
            FluentIcons.Light.Cut,
            FluentIcons.Light.Delete,
            FluentIcons.Light.Dismiss,
            FluentIcons.Light.DismissCircle,
            FluentIcons.Light.Document,
            FluentIcons.Light.DocumentLightning,
            FluentIcons.Light.DocumentSignature,
            FluentIcons.Light.DocumentSparkle,
            FluentIcons.Light.DoorArrowRight,
            FluentIcons.Light.Edit,
            FluentIcons.Light.Emoji,
            FluentIcons.Light.Eye,
            FluentIcons.Light.EyeOff,
            FluentIcons.Light.Filter,
            FluentIcons.Light.Flag,
            FluentIcons.Light.FlagOff,
            FluentIcons.Light.Flash,
            FluentIcons.Light.FolderArrowRight,
            FluentIcons.Light.FolderMail,
            FluentIcons.Light.HandDraw,
            FluentIcons.Light.History,
            FluentIcons.Light.ImageAdd,
            FluentIcons.Light.ImageAltText,
            FluentIcons.Light.ImageCopy,
            FluentIcons.Light.ImageReflection,
            FluentIcons.Light.ImageShadow,
            FluentIcons.Light.ImmersiveReader,
            FluentIcons.Light.Important,
            FluentIcons.Light.Lasso,
            FluentIcons.Light.LayoutColumnTwo,
            FluentIcons.Light.LayoutColumnTwoFocusLeft,
            FluentIcons.Light.LayoutColumnTwoFocusRight,
            FluentIcons.Light.LayoutRowTwo,
            FluentIcons.Light.LayoutRowTwoFocusTop,
            FluentIcons.Light.LayoutRowTwoFocusTopSettings,
            FluentIcons.Light.LayoutRowTwoSettings,
            FluentIcons.Light.Lightbulb,
            FluentIcons.Light.Link,
            FluentIcons.Light.LockClosed,
            FluentIcons.Light.LockOpen,
            FluentIcons.Light.Mail,
            FluentIcons.Light.MailAlert,
            FluentIcons.Light.MailArrowClockwise,
            FluentIcons.Light.MailArrowDoubleBack,
            FluentIcons.Light.MailCopy,
            FluentIcons.Light.MailEdit,
            FluentIcons.Light.MailList,
            FluentIcons.Light.MailMultiple,
            FluentIcons.Light.MailRead,
            FluentIcons.Light.MailReadMultiple,
            FluentIcons.Light.MailRewind,
            FluentIcons.Light.MailSettings,
            FluentIcons.Light.MailTemplate,
            FluentIcons.Light.MailUnread,
            FluentIcons.Light.Mic,
            FluentIcons.Light.Molecule,
            FluentIcons.Light.Note,
            FluentIcons.Light.Options,
            FluentIcons.Light.PaintBrush,
            FluentIcons.Light.PanelLeftDefault,
            FluentIcons.Light.PanelLeftFocusRight,
            FluentIcons.Light.PenSparkle,
            FluentIcons.Light.People,
            FluentIcons.Light.PeopleAdd,
            FluentIcons.Light.PeopleCommunity,
            FluentIcons.Light.PeopleEdit,
            FluentIcons.Light.PeopleList,
            FluentIcons.Light.PeopleSettings,
            FluentIcons.Light.PeopleSync,
            FluentIcons.Light.Person,
            FluentIcons.Light.PersonAdd,
            FluentIcons.Light.PersonAvailable,
            FluentIcons.Light.PersonFeedback,
            FluentIcons.Light.PersonMail,
            FluentIcons.Light.PersonProhibited,
            FluentIcons.Light.PersonSuport,
            FluentIcons.Light.PersonSupport,
            FluentIcons.Light.Phone,
            FluentIcons.Light.PictureInPicture,
            FluentIcons.Light.Pin,
            FluentIcons.Light.PinOff,
            FluentIcons.Light.Poll,
            FluentIcons.Light.Print,
            FluentIcons.Light.Question,
            FluentIcons.Light.ReadAloud,
            FluentIcons.Light.RectangleLandscape,
            FluentIcons.Light.RotateLeft,
            FluentIcons.Light.Save,
            FluentIcons.Light.SendClock,
            FluentIcons.Light.Settings,
            FluentIcons.Light.Share,
            FluentIcons.Light.ShieldError,
            FluentIcons.Light.Signature,
            FluentIcons.Light.SpeakerMute,
            FluentIcons.Light.SquareArrowForward,
            FluentIcons.Light.Stamp,
            FluentIcons.Light.StarAdd,
            FluentIcons.Light.StarArrowRight,
            FluentIcons.Light.Sticker,
            FluentIcons.Light.TabAdd,
            FluentIcons.Light.Table,
            FluentIcons.Light.TableAltText,
            FluentIcons.Light.TableCellsMerge,
            FluentIcons.Light.TableCellsSplit,
            FluentIcons.Light.TableDismiss,
            FluentIcons.Light.TableMoveAbove,
            FluentIcons.Light.TableMoveBelow,
            FluentIcons.Light.TableMoveLeft,
            FluentIcons.Light.TableMoveRight,
            FluentIcons.Light.TableSettings,
            FluentIcons.Light.TableSimple,
            FluentIcons.Light.Tag,
            FluentIcons.Light.Text,
            FluentIcons.Light.TextBoxAlignTopLeft,
            FluentIcons.Light.TextClearFormatting,
            FluentIcons.Light.TextCollapse,
            FluentIcons.Light.TextDensity,
            FluentIcons.Light.TextEditStyle,
            FluentIcons.Light.TextExpand,
            FluentIcons.Light.TextBoxAlignTopLeft,
            FluentIcons.Light.Toolbox,
            FluentIcons.Light.Translate,
            FluentIcons.Light.Video,
            FluentIcons.Light.VideoClip,
            FluentIcons.Light.WeatherMoon,
            FluentIcons.Light.WeatherSunny,
            FluentIcons.Light.Window,
            FluentIcons.Light.WrenchScrewdriver,
            FluentIcons.Light.ZoomIn,
            FluentIcons.Light.ZoomOut
        )

        return lightIcons!!
    }

private var lightIcons: List<ImageVector>? = null