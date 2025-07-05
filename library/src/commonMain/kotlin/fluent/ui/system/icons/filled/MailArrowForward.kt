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
 * MailArrowForward Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook
 * - Description: Used in general mail scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mail_arrow_forward_20_filled.svg)
 * 
 * @return The [ImageVector] for the MailArrowForward icon.
 */
public val FluentIcons.Filled.MailArrowForward: ImageVector
    get() {
        if (_mailArrowForward != null) {
            return _mailArrowForward!!
        }
        _mailArrowForward = Builder(name = "MailArrowForward", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
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
                moveTo(10.0f, 5.5f)
                curveTo(10.0f, 7.985f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 7.985f, 19.0f, 5.5f)
                curveTo(19.0f, 3.015f, 16.985f, 1.0f, 14.5f, 1.0f)
                curveTo(12.015f, 1.0f, 10.0f, 3.015f, 10.0f, 5.5f)
                close()
                moveTo(15.396f, 2.896f)
                curveTo(15.592f, 2.701f, 15.908f, 2.701f, 16.104f, 2.896f)
                lineTo(17.854f, 4.646f)
                curveTo(17.902f, 4.694f, 17.938f, 4.75f, 17.962f, 4.809f)
                curveTo(17.986f, 4.868f, 18.0f, 4.932f, 18.0f, 5.0f)
                curveTo(18.0f, 5.068f, 17.986f, 5.132f, 17.962f, 5.191f)
                curveTo(17.938f, 5.249f, 17.903f, 5.304f, 17.856f, 5.351f)
                lineTo(16.104f, 7.104f)
                curveTo(15.908f, 7.299f, 15.592f, 7.299f, 15.396f, 7.104f)
                curveTo(15.201f, 6.908f, 15.201f, 6.592f, 15.396f, 6.396f)
                lineTo(16.293f, 5.5f)
                horizontalLineTo(14.75f)
                curveTo(13.783f, 5.5f, 13.0f, 6.284f, 13.0f, 7.25f)
                verticalLineTo(7.5f)
                curveTo(13.0f, 7.776f, 12.776f, 8.0f, 12.5f, 8.0f)
                curveTo(12.224f, 8.0f, 12.0f, 7.776f, 12.0f, 7.5f)
                verticalLineTo(7.25f)
                curveTo(12.0f, 5.731f, 13.231f, 4.5f, 14.75f, 4.5f)
                horizontalLineTo(16.293f)
                lineTo(15.396f, 3.604f)
                curveTo(15.201f, 3.408f, 15.201f, 3.092f, 15.396f, 2.896f)
                close()
            }
        }
        .build()
        return _mailArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _mailArrowForward: ImageVector? = null

@Preview
@Composable
private fun MailArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailArrowForward, contentDescription = "MailArrowForward Icon")
    }
}

