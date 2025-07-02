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
 * XboxControllerError icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: xbox, controller, error
 * - Source: ic_fluent_xbox_controller_error_24_regular.svg
 * 
 * @return The [ImageVector] for the XboxControllerError icon.
 */
public val FluentIcons.Regular.XboxControllerError: ImageVector
    get() {
        if (_xboxControllerError != null) {
            return _xboxControllerError!!
        }
        _xboxControllerError = Builder(name = "XboxControllerError", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.807f, 4.508f)
                curveTo(9.278f, 4.243f, 8.697f, 4.202f, 8.168f, 4.302f)
                lineTo(6.986f, 4.528f)
                curveTo(6.124f, 4.692f, 5.382f, 5.245f, 4.982f, 6.028f)
                curveTo(3.615f, 8.7f, 2.581f, 10.889f, 2.183f, 12.757f)
                curveTo(1.771f, 14.683f, 2.023f, 16.332f, 3.262f, 17.833f)
                curveTo(4.083f, 18.829f, 5.491f, 18.627f, 6.225f, 17.797f)
                curveTo(6.784f, 17.165f, 7.42f, 16.433f, 8.043f, 15.711f)
                curveTo(8.452f, 15.236f, 9.047f, 14.962f, 9.672f, 14.962f)
                horizontalLineTo(11.183f)
                curveTo(11.305f, 14.461f, 11.484f, 13.982f, 11.715f, 13.534f)
                horizontalLineTo(9.672f)
                curveTo(8.629f, 13.534f, 7.64f, 13.99f, 6.961f, 14.778f)
                curveTo(6.34f, 15.497f, 5.708f, 16.225f, 5.155f, 16.851f)
                curveTo(5.029f, 16.994f, 4.861f, 17.066f, 4.712f, 17.073f)
                curveTo(4.57f, 17.079f, 4.451f, 17.03f, 4.364f, 16.924f)
                curveTo(3.459f, 15.828f, 3.239f, 14.65f, 3.58f, 13.055f)
                curveTo(3.933f, 11.402f, 4.873f, 9.377f, 6.254f, 6.678f)
                curveTo(6.452f, 6.29f, 6.823f, 6.013f, 7.253f, 5.931f)
                lineTo(8.436f, 5.705f)
                curveTo(8.711f, 5.653f, 8.965f, 5.684f, 9.168f, 5.785f)
                curveTo(9.295f, 5.849f, 9.429f, 5.919f, 9.566f, 5.993f)
                curveTo(10.105f, 6.285f, 10.718f, 6.462f, 11.359f, 6.462f)
                horizontalLineTo(12.641f)
                curveTo(13.282f, 6.462f, 13.895f, 6.285f, 14.435f, 5.993f)
                curveTo(14.572f, 5.919f, 14.705f, 5.849f, 14.832f, 5.785f)
                curveTo(15.035f, 5.684f, 15.289f, 5.653f, 15.565f, 5.705f)
                lineTo(16.747f, 5.931f)
                curveTo(17.178f, 6.013f, 17.548f, 6.29f, 17.747f, 6.678f)
                curveTo(18.448f, 8.05f, 19.037f, 9.248f, 19.492f, 10.311f)
                curveTo(20.19f, 10.536f, 20.836f, 10.875f, 21.409f, 11.307f)
                curveTo(20.886f, 9.775f, 20.047f, 8.038f, 19.018f, 6.028f)
                curveTo(18.618f, 5.245f, 17.876f, 4.692f, 17.015f, 4.528f)
                lineTo(15.832f, 4.302f)
                curveTo(15.303f, 4.202f, 14.722f, 4.243f, 14.193f, 4.508f)
                curveTo(14.05f, 4.579f, 13.903f, 4.657f, 13.754f, 4.737f)
                curveTo(13.399f, 4.93f, 13.018f, 5.034f, 12.641f, 5.034f)
                horizontalLineTo(11.359f)
                curveTo(10.983f, 5.034f, 10.602f, 4.93f, 10.246f, 4.737f)
                curveTo(10.098f, 4.657f, 9.951f, 4.579f, 9.807f, 4.508f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(12.552f, 10.0f, 13.0f, 9.553f, 13.0f, 9.0f)
                curveTo(13.0f, 8.448f, 12.552f, 8.0f, 12.0f, 8.0f)
                curveTo(11.448f, 8.0f, 11.0f, 8.448f, 11.0f, 9.0f)
                curveTo(11.0f, 9.553f, 11.448f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(23.0f, 16.5f)
                curveTo(23.0f, 19.538f, 20.538f, 22.0f, 17.5f, 22.0f)
                curveTo(14.462f, 22.0f, 12.0f, 19.538f, 12.0f, 16.5f)
                curveTo(12.0f, 13.463f, 14.462f, 11.0f, 17.5f, 11.0f)
                curveTo(20.538f, 11.0f, 23.0f, 13.463f, 23.0f, 16.5f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(17.224f, 13.0f, 17.0f, 13.224f, 17.0f, 13.5f)
                verticalLineTo(17.5f)
                curveTo(17.0f, 17.777f, 17.224f, 18.0f, 17.5f, 18.0f)
                curveTo(17.776f, 18.0f, 18.0f, 17.777f, 18.0f, 17.5f)
                verticalLineTo(13.5f)
                curveTo(18.0f, 13.224f, 17.776f, 13.0f, 17.5f, 13.0f)
                close()
                moveTo(17.5f, 20.125f)
                curveTo(17.845f, 20.125f, 18.125f, 19.846f, 18.125f, 19.5f)
                curveTo(18.125f, 19.155f, 17.845f, 18.875f, 17.5f, 18.875f)
                curveTo(17.155f, 18.875f, 16.875f, 19.155f, 16.875f, 19.5f)
                curveTo(16.875f, 19.846f, 17.155f, 20.125f, 17.5f, 20.125f)
                close()
            }
        }
        .build()
        return _xboxControllerError!!
    }

@Suppress("ObjectPropertyName")
private var _xboxControllerError: ImageVector? = null

@Preview
@Composable
private fun XboxControllerErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.XboxControllerError, contentDescription = null)
    }
}

