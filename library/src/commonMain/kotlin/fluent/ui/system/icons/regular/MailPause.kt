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

package fluent.ui.system.icons.regular

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
 * MailPause icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: mail, pause
 * - Source: ic_fluent_mail_pause_20_regular.svg
 * 
 * @return The [ImageVector] for the MailPause icon.
 */
public val FluentIcons.Regular.MailPause: ImageVector
    get() {
        if (_mailPause != null) {
            return _mailPause!!
        }
        _mailPause = Builder(name = "MailPause", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 14.5f)
                verticalLineTo(10.4f)
                curveTo(17.358f, 10.217f, 17.693f, 9.996f, 18.0f, 9.743f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 15.881f, 16.881f, 17.0f, 15.5f, 17.0f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 17.0f, 2.0f, 15.881f, 2.0f, 14.5f)
                verticalLineTo(6.5f)
                curveTo(2.0f, 5.119f, 3.119f, 4.0f, 4.5f, 4.0f)
                horizontalLineTo(9.207f)
                curveTo(9.116f, 4.322f, 9.053f, 4.657f, 9.022f, 5.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 5.0f, 3.0f, 5.672f, 3.0f, 6.5f)
                verticalLineTo(6.802f)
                lineTo(10.0f, 10.92f)
                lineTo(11.441f, 10.072f)
                curveTo(11.766f, 10.289f, 12.115f, 10.473f, 12.484f, 10.619f)
                lineTo(10.253f, 11.931f)
                curveTo(10.123f, 12.008f, 9.967f, 12.021f, 9.828f, 11.969f)
                lineTo(9.746f, 11.931f)
                lineTo(3.0f, 7.963f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 15.328f, 3.672f, 16.0f, 4.5f, 16.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 16.0f, 17.0f, 15.328f, 17.0f, 14.5f)
                close()
                moveTo(14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 7.985f, 19.0f, 5.5f)
                curveTo(19.0f, 3.015f, 16.985f, 1.0f, 14.5f, 1.0f)
                curveTo(12.015f, 1.0f, 10.0f, 3.015f, 10.0f, 5.5f)
                curveTo(10.0f, 7.985f, 12.015f, 10.0f, 14.5f, 10.0f)
                close()
                moveTo(13.5f, 3.5f)
                verticalLineTo(7.5f)
                curveTo(13.5f, 7.776f, 13.276f, 8.0f, 13.0f, 8.0f)
                curveTo(12.724f, 8.0f, 12.5f, 7.776f, 12.5f, 7.5f)
                verticalLineTo(3.5f)
                curveTo(12.5f, 3.224f, 12.724f, 3.0f, 13.0f, 3.0f)
                curveTo(13.276f, 3.0f, 13.5f, 3.224f, 13.5f, 3.5f)
                close()
                moveTo(16.5f, 3.5f)
                verticalLineTo(7.5f)
                curveTo(16.5f, 7.776f, 16.276f, 8.0f, 16.0f, 8.0f)
                curveTo(15.724f, 8.0f, 15.5f, 7.776f, 15.5f, 7.5f)
                verticalLineTo(3.5f)
                curveTo(15.5f, 3.224f, 15.724f, 3.0f, 16.0f, 3.0f)
                curveTo(16.276f, 3.0f, 16.5f, 3.224f, 16.5f, 3.5f)
                close()
            }
        }
        .build()
        return _mailPause!!
    }

@Suppress("ObjectPropertyName")
private var _mailPause: ImageVector? = null

@Preview
@Composable
private fun MailPausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailPause, contentDescription = null)
    }
}

