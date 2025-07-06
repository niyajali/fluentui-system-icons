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
 * ChatArrowDoubleBack Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in real time chat scenarios (versus comment - different icon).
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_chat_arrow_double_back_20_filled.svg)
 * 
 * @return The [ImageVector] for the ChatArrowDoubleBack icon.
 */
public val FluentIcons.Filled.ChatArrowDoubleBack: ImageVector
    get() {
        if (_chatArrowDoubleBack != null) {
            return _chatArrowDoubleBack!!
        }
        _chatArrowDoubleBack = Builder(name = "ChatArrowDoubleBack", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, fillAlpha = 0.99f, strokeAlpha = 0.99f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(14.418f, 2.0f, 18.0f, 5.582f, 18.0f, 10.0f)
                curveTo(18.0f, 10.085f, 17.999f, 10.17f, 17.996f, 10.254f)
                curveTo(17.046f, 9.471f, 15.828f, 9.0f, 14.5f, 9.0f)
                curveTo(11.462f, 9.0f, 9.0f, 11.462f, 9.0f, 14.5f)
                curveTo(9.0f, 15.828f, 9.471f, 17.046f, 10.254f, 17.996f)
                curveTo(10.17f, 17.999f, 10.085f, 18.0f, 10.0f, 18.0f)
                curveTo(8.727f, 18.0f, 7.496f, 17.702f, 6.387f, 17.139f)
                lineTo(6.266f, 17.075f)
                lineTo(2.621f, 17.985f)
                curveTo(2.311f, 18.063f, 2.026f, 17.837f, 2.001f, 17.544f)
                lineTo(2.001f, 17.462f)
                lineTo(2.015f, 17.379f)
                lineTo(2.925f, 13.735f)
                lineTo(2.862f, 13.615f)
                curveTo(2.407f, 12.719f, 2.124f, 11.742f, 2.033f, 10.728f)
                lineTo(2.007f, 10.346f)
                lineTo(2.0f, 10.0f)
                curveTo(2.0f, 5.582f, 5.582f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(13.354f, 13.354f)
                curveTo(13.549f, 13.158f, 13.549f, 12.842f, 13.354f, 12.646f)
                curveTo(13.158f, 12.451f, 12.842f, 12.451f, 12.646f, 12.646f)
                lineTo(11.146f, 14.146f)
                curveTo(10.951f, 14.342f, 10.951f, 14.658f, 11.146f, 14.854f)
                lineTo(12.646f, 16.354f)
                curveTo(12.842f, 16.549f, 13.158f, 16.549f, 13.354f, 16.354f)
                curveTo(13.549f, 16.158f, 13.549f, 15.842f, 13.354f, 15.646f)
                lineTo(12.207f, 14.5f)
                lineTo(13.354f, 13.354f)
                close()
                moveTo(15.207f, 14.0f)
                lineTo(15.854f, 13.354f)
                curveTo(16.049f, 13.158f, 16.049f, 12.842f, 15.854f, 12.646f)
                curveTo(15.658f, 12.451f, 15.342f, 12.451f, 15.146f, 12.646f)
                lineTo(13.646f, 14.146f)
                curveTo(13.451f, 14.342f, 13.451f, 14.658f, 13.646f, 14.854f)
                lineTo(15.146f, 16.354f)
                curveTo(15.342f, 16.549f, 15.658f, 16.549f, 15.854f, 16.354f)
                curveTo(16.049f, 16.158f, 16.049f, 15.842f, 15.854f, 15.646f)
                lineTo(15.207f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 15.776f, 17.224f, 16.0f, 17.5f, 16.0f)
                curveTo(17.776f, 16.0f, 18.0f, 15.776f, 18.0f, 15.5f)
                verticalLineTo(15.0f)
                curveTo(18.0f, 14.448f, 17.552f, 14.0f, 17.0f, 14.0f)
                horizontalLineTo(15.207f)
                close()
            }
        }
        .build()
        return _chatArrowDoubleBack!!
    }

@Suppress("ObjectPropertyName")
private var _chatArrowDoubleBack: ImageVector? = null

@Preview
@Composable
private fun ChatArrowDoubleBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChatArrowDoubleBack, contentDescription = "ChatArrowDoubleBack Icon")
    }
}

