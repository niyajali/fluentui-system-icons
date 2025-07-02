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

package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * MailBriefcase icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 48dp
 * - Keywords: mail, briefcase
 * - Source: ic_fluent_mail_briefcase_48_filled.svg
 * 
 * @return The [ImageVector] for the MailBriefcase icon.
 */
public val FluentIcons.Filled.MailBriefcase: ImageVector
    get() {
        if (_mailBriefcase != null) {
            return _mailBriefcase!!
        }
        _mailBriefcase = Builder(name = "MailBriefcase", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(27.0f)
                curveTo(25.343f, 7.0f, 24.0f, 8.343f, 24.0f, 10.0f)
                verticalLineTo(21.0f)
                curveTo(24.0f, 22.657f, 25.343f, 24.0f, 27.0f, 24.0f)
                horizontalLineTo(43.0f)
                curveTo(44.657f, 24.0f, 46.0f, 22.657f, 46.0f, 21.0f)
                verticalLineTo(10.0f)
                curveTo(46.0f, 8.343f, 44.657f, 7.0f, 43.0f, 7.0f)
                horizontalLineTo(41.0f)
                verticalLineTo(5.5f)
                curveTo(41.0f, 3.567f, 39.433f, 2.0f, 37.5f, 2.0f)
                horizontalLineTo(32.5f)
                curveTo(30.567f, 2.0f, 29.0f, 3.567f, 29.0f, 5.5f)
                close()
                moveTo(32.5f, 4.0f)
                horizontalLineTo(37.5f)
                curveTo(38.328f, 4.0f, 39.0f, 4.672f, 39.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(31.0f)
                verticalLineTo(5.5f)
                curveTo(31.0f, 4.672f, 31.672f, 4.0f, 32.5f, 4.0f)
                close()
                moveTo(10.25f, 9.0f)
                horizontalLineTo(22.1f)
                curveTo(22.034f, 9.323f, 22.0f, 9.658f, 22.0f, 10.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 22.761f, 22.91f, 24.309f, 24.286f, 25.2f)
                lineTo(24.002f, 25.35f)
                lineTo(4.02f, 14.747f)
                curveTo(4.276f, 11.53f, 6.968f, 9.0f, 10.25f, 9.0f)
                close()
                moveTo(24.582f, 27.87f)
                lineTo(28.133f, 26.0f)
                horizontalLineTo(43.0f)
                curveTo(43.342f, 26.0f, 43.677f, 25.966f, 44.0f, 25.9f)
                verticalLineTo(34.75f)
                curveTo(44.0f, 38.202f, 41.202f, 41.0f, 37.75f, 41.0f)
                horizontalLineTo(10.25f)
                curveTo(6.798f, 41.0f, 4.0f, 38.202f, 4.0f, 34.75f)
                verticalLineTo(17.566f)
                lineTo(23.414f, 27.868f)
                curveTo(23.779f, 28.062f, 24.217f, 28.062f, 24.582f, 27.87f)
                close()
            }
        }
        .build()
        return _mailBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _mailBriefcase: ImageVector? = null

@Preview
@Composable
private fun MailBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailBriefcase, contentDescription = null)
    }
}

