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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.TextHeader3LinesCaret: ImageVector
    get() {
        if (_TextHeader3LinesCaret != null) {
            return _TextHeader3LinesCaret!!
        }
        _TextHeader3LinesCaret = ImageVector.Builder(
            name = "Filled.TextHeader3LinesCaret",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.994f, 4.345f)
                curveTo(12.46f, 3.826f, 13.308f, 3.645f, 13.828f, 3.812f)
                curveTo(14.144f, 3.913f, 14.354f, 4.127f, 14.445f, 4.347f)
                curveTo(14.53f, 4.551f, 14.525f, 4.78f, 14.369f, 5.013f)
                curveTo(14.088f, 5.43f, 13.628f, 5.496f, 12.899f, 5.502f)
                lineTo(12.853f, 5.502f)
                lineTo(12.766f, 5.502f)
                curveTo(12.214f, 5.502f, 11.766f, 5.95f, 11.766f, 6.502f)
                curveTo(11.766f, 7.054f, 12.214f, 7.502f, 12.766f, 7.502f)
                lineTo(12.853f, 7.502f)
                lineTo(12.899f, 7.503f)
                curveTo(13.628f, 7.509f, 14.088f, 7.574f, 14.369f, 7.991f)
                curveTo(14.525f, 8.224f, 14.53f, 8.453f, 14.445f, 8.657f)
                curveTo(14.354f, 8.877f, 14.144f, 9.092f, 13.828f, 9.193f)
                curveTo(13.308f, 9.359f, 12.46f, 9.178f, 11.994f, 8.659f)
                curveTo(11.625f, 8.248f, 10.993f, 8.214f, 10.582f, 8.583f)
                curveTo(10.171f, 8.952f, 10.137f, 9.585f, 10.506f, 9.996f)
                curveTo(11.508f, 11.112f, 13.182f, 11.499f, 14.437f, 11.097f)
                curveTo(16.114f, 10.561f, 17.176f, 8.581f, 16.028f, 6.875f)
                curveTo(15.936f, 6.737f, 15.837f, 6.614f, 15.733f, 6.502f)
                curveTo(15.837f, 6.391f, 15.936f, 6.267f, 16.028f, 6.129f)
                curveTo(17.176f, 4.423f, 16.114f, 2.443f, 14.437f, 1.907f)
                curveTo(13.182f, 1.505f, 11.508f, 1.892f, 10.506f, 3.009f)
                curveTo(10.137f, 3.419f, 10.171f, 4.052f, 10.582f, 4.421f)
                curveTo(10.993f, 4.79f, 11.625f, 4.756f, 11.994f, 4.345f)
                close()
                moveTo(3f, 2f)
                curveTo(3.552f, 2f, 4f, 2.448f, 4f, 3f)
                lineTo(4f, 5.5f)
                horizontalLineTo(7f)
                verticalLineTo(3.002f)
                curveTo(7f, 2.449f, 7.448f, 2.002f, 8f, 2.002f)
                curveTo(8.552f, 2.002f, 9f, 2.449f, 9f, 3.002f)
                lineTo(9f, 9.995f)
                curveTo(9f, 10.547f, 8.552f, 10.995f, 8f, 10.995f)
                curveTo(7.448f, 10.995f, 7f, 10.547f, 7f, 9.995f)
                verticalLineTo(7.5f)
                lineTo(4f, 7.5f)
                lineTo(4f, 10f)
                curveTo(4f, 10.552f, 3.552f, 11f, 3f, 11f)
                curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
                verticalLineTo(3f)
                curveTo(2f, 2.448f, 2.448f, 2f, 3f, 2f)
                close()
                moveTo(17.557f, 5.462f)
                curveTo(17.673f, 5.182f, 17.947f, 4.999f, 18.25f, 4.999f)
                horizontalLineTo(21.252f)
                curveTo(21.555f, 4.999f, 21.829f, 5.182f, 21.945f, 5.462f)
                curveTo(22.061f, 5.742f, 21.997f, 6.065f, 21.782f, 6.28f)
                lineTo(20.282f, 7.78f)
                curveTo(19.989f, 8.073f, 19.514f, 8.073f, 19.22f, 7.78f)
                lineTo(17.72f, 6.28f)
                curveTo(17.505f, 6.065f, 17.441f, 5.742f, 17.557f, 5.462f)
                close()
                moveTo(2f, 20f)
                curveTo(2f, 19.448f, 2.448f, 19f, 3f, 19f)
                horizontalLineTo(21f)
                curveTo(21.552f, 19f, 22f, 19.448f, 22f, 20f)
                curveTo(22f, 20.552f, 21.552f, 21f, 21f, 21f)
                horizontalLineTo(3f)
                curveTo(2.448f, 21f, 2f, 20.552f, 2f, 20f)
                close()
                moveTo(3f, 14f)
                curveTo(2.448f, 14f, 2f, 14.448f, 2f, 15f)
                curveTo(2f, 15.552f, 2.448f, 16f, 3f, 16f)
                horizontalLineTo(21f)
                curveTo(21.552f, 16f, 22f, 15.552f, 22f, 15f)
                curveTo(22f, 14.448f, 21.552f, 14f, 21f, 14f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _TextHeader3LinesCaret!!
    }

@Suppress("ObjectPropertyName")
private var _TextHeader3LinesCaret: ImageVector? = null

@Preview
@Composable
private fun TextHeader3LinesCaretPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHeader3LinesCaret, contentDescription = null)
    }
}
