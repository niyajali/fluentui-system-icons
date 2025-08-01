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

public val FluentIcons.Filled.PersonVoice: ImageVector
    get() {
        if (_PersonVoice != null) {
            return _PersonVoice!!
        }
        _PersonVoice = ImageVector.Builder(
            name = "Filled.PersonVoice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.392f, 0.466f)
                curveTo(20.755f, 0.267f, 21.211f, 0.4f, 21.41f, 0.763f)
                curveTo(22.424f, 2.615f, 23.001f, 4.741f, 23.001f, 7f)
                curveTo(23.001f, 9.258f, 22.424f, 11.384f, 21.41f, 13.236f)
                curveTo(21.211f, 13.6f, 20.755f, 13.733f, 20.392f, 13.534f)
                curveTo(20.028f, 13.335f, 19.895f, 12.879f, 20.094f, 12.516f)
                curveTo(20.991f, 10.879f, 21.501f, 9f, 21.501f, 7f)
                curveTo(21.501f, 5f, 20.991f, 3.121f, 20.094f, 1.484f)
                curveTo(19.895f, 1.121f, 20.028f, 0.665f, 20.392f, 0.466f)
                close()
                moveTo(17.29f, 3.061f)
                curveTo(17.671f, 2.897f, 18.112f, 3.074f, 18.275f, 3.454f)
                curveTo(18.742f, 4.543f, 19.001f, 5.742f, 19.001f, 7f)
                curveTo(19.001f, 8.257f, 18.742f, 9.456f, 18.275f, 10.545f)
                curveTo(18.112f, 10.926f, 17.671f, 11.102f, 17.29f, 10.939f)
                curveTo(16.91f, 10.776f, 16.733f, 10.335f, 16.897f, 9.954f)
                curveTo(17.285f, 9.048f, 17.501f, 8.05f, 17.501f, 7f)
                curveTo(17.501f, 5.949f, 17.285f, 4.951f, 16.897f, 4.046f)
                curveTo(16.733f, 3.665f, 16.91f, 3.224f, 17.29f, 3.061f)
                close()
                moveTo(18.003f, 16.249f)
                curveTo(18.003f, 15.007f, 16.997f, 14f, 15.755f, 14f)
                horizontalLineTo(4.253f)
                curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(2.004f, 17.741f, 2.182f, 18.298f, 2.514f, 18.764f)
                curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
                curveTo(13.421f, 22.001f, 15.945f, 20.929f, 17.491f, 18.766f)
                curveTo(17.824f, 18.299f, 18.003f, 17.74f, 18.003f, 17.167f)
                verticalLineTo(16.249f)
                close()
                moveTo(15f, 7.004f)
                curveTo(15f, 4.243f, 12.762f, 2.004f, 10f, 2.004f)
                curveTo(7.239f, 2.004f, 5f, 4.243f, 5f, 7.004f)
                curveTo(5f, 9.766f, 7.239f, 12.004f, 10f, 12.004f)
                curveTo(12.762f, 12.004f, 15f, 9.766f, 15f, 7.004f)
                close()
            }
        }.build()

        return _PersonVoice!!
    }

@Suppress("ObjectPropertyName")
private var _PersonVoice: ImageVector? = null

@Preview
@Composable
private fun PersonVoicePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonVoice, contentDescription = null)
    }
}
