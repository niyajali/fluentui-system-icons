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
 * ChatArrowBack icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: chat, arrow, back
 * - Source: ic_fluent_chat_arrow_back_20_filled.svg
 * 
 * @return The [ImageVector] for the ChatArrowBack icon.
 */
public val FluentIcons.Filled.ChatArrowBack: ImageVector
    get() {
        if (_chatArrowBack != null) {
            return _chatArrowBack!!
        }
        _chatArrowBack = Builder(name = "ChatArrowBack", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(13.604f, 12.604f)
                lineTo(12.707f, 13.5f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 13.5f, 17.0f, 14.731f, 17.0f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(17.0f, 16.776f, 16.776f, 17.0f, 16.5f, 17.0f)
                curveTo(16.224f, 17.0f, 16.0f, 16.776f, 16.0f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(16.0f, 15.283f, 15.217f, 14.5f, 14.25f, 14.5f)
                horizontalLineTo(12.707f)
                lineTo(13.604f, 15.396f)
                curveTo(13.799f, 15.592f, 13.799f, 15.908f, 13.604f, 16.104f)
                curveTo(13.408f, 16.299f, 13.092f, 16.299f, 12.896f, 16.104f)
                lineTo(11.144f, 14.351f)
                curveTo(11.097f, 14.304f, 11.062f, 14.25f, 11.038f, 14.191f)
                curveTo(11.014f, 14.132f, 11.0f, 14.068f, 11.0f, 14.0f)
                curveTo(11.0f, 13.932f, 11.014f, 13.868f, 11.038f, 13.809f)
                curveTo(11.062f, 13.75f, 11.099f, 13.694f, 11.146f, 13.646f)
                lineTo(12.896f, 11.896f)
                curveTo(13.092f, 11.701f, 13.408f, 11.701f, 13.604f, 11.896f)
                curveTo(13.799f, 12.092f, 13.799f, 12.408f, 13.604f, 12.604f)
                close()
            }
        }
        .build()
        return _chatArrowBack!!
    }

@Suppress("ObjectPropertyName")
private var _chatArrowBack: ImageVector? = null

@Preview
@Composable
private fun ChatArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChatArrowBack, contentDescription = null)
    }
}

