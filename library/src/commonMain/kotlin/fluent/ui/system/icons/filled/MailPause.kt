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
 * MailPause icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: mail, pause
 * - Source: ic_fluent_mail_pause_20_filled.svg
 * 
 * @return The [ImageVector] for the MailPause icon.
 */
public val FluentIcons.Filled.MailPause: ImageVector
    get() {
        if (_mailPause != null) {
            return _mailPause!!
        }
        _mailPause = Builder(name = "MailPause", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                curveTo(15.83f, 11.0f, 17.049f, 10.528f, 18.0f, 9.743f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 15.881f, 16.881f, 17.0f, 15.5f, 17.0f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 17.0f, 2.0f, 15.881f, 2.0f, 14.5f)
                verticalLineTo(7.373f)
                lineTo(9.747f, 11.931f)
                curveTo(9.903f, 12.023f, 10.097f, 12.023f, 10.254f, 11.931f)
                lineTo(12.484f, 10.619f)
                curveTo(13.108f, 10.865f, 13.788f, 11.0f, 14.5f, 11.0f)
                close()
                moveTo(4.5f, 4.0f)
                horizontalLineTo(9.207f)
                curveTo(9.072f, 4.477f, 9.0f, 4.98f, 9.0f, 5.5f)
                curveTo(9.0f, 7.406f, 9.969f, 9.085f, 11.442f, 10.072f)
                lineTo(10.0f, 10.92f)
                lineTo(2.015f, 6.223f)
                curveTo(2.153f, 4.973f, 3.213f, 4.0f, 4.5f, 4.0f)
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
        Image(imageVector = FluentIcons.Filled.MailPause, contentDescription = null)
    }
}

