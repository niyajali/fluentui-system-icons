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

public val FluentIcons.Filled.TextClearFormatting: ImageVector
    get() {
        if (_TextClearFormatting != null) {
            return _TextClearFormatting!!
        }
        _TextClearFormatting = ImageVector.Builder(
            name = "Filled.TextClearFormatting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.761f, 14.001f)
                curveTo(2.541f, 14.001f, 2.358f, 13.941f, 2.212f, 13.821f)
                curveTo(2.07f, 13.696f, 2f, 13.541f, 2f, 13.356f)
                curveTo(2f, 13.248f, 2.031f, 13.112f, 2.093f, 12.949f)
                lineTo(6.019f, 2.711f)
                curveTo(6.199f, 2.238f, 6.532f, 2.001f, 7.017f, 2.001f)
                curveTo(7.474f, 2.001f, 7.792f, 2.235f, 7.973f, 2.703f)
                lineTo(11.907f, 12.949f)
                curveTo(11.969f, 13.112f, 12f, 13.248f, 12f, 13.356f)
                curveTo(12f, 13.541f, 11.927f, 13.696f, 11.78f, 13.821f)
                curveTo(11.639f, 13.941f, 11.458f, 14.001f, 11.239f, 14.001f)
                curveTo(10.878f, 14.001f, 10.629f, 13.813f, 10.494f, 13.438f)
                lineTo(9.411f, 10.518f)
                horizontalLineTo(4.58f)
                lineTo(3.506f, 13.438f)
                curveTo(3.371f, 13.813f, 3.122f, 14.001f, 2.761f, 14.001f)
                close()
                moveTo(5.02f, 9.269f)
                horizontalLineTo(8.98f)
                lineTo(7.025f, 3.902f)
                horizontalLineTo(6.975f)
                lineTo(5.02f, 9.269f)
                close()
                moveTo(12.791f, 14.73f)
                lineTo(18.272f, 20.211f)
                lineTo(22.428f, 16.054f)
                curveTo(23.191f, 15.292f, 23.191f, 14.057f, 22.43f, 13.295f)
                lineTo(19.706f, 10.571f)
                curveTo(19.566f, 10.431f, 19.409f, 10.316f, 19.242f, 10.228f)
                curveTo(18.505f, 9.836f, 17.569f, 9.952f, 16.947f, 10.573f)
                lineTo(12.791f, 14.73f)
                close()
                moveTo(14.748f, 11.358f)
                lineTo(13f, 13.106f)
                verticalLineTo(2.756f)
                curveTo(13f, 2.534f, 13.065f, 2.353f, 13.195f, 2.212f)
                curveTo(13.33f, 2.071f, 13.5f, 2.001f, 13.706f, 2.001f)
                curveTo(13.911f, 2.001f, 14.079f, 2.071f, 14.209f, 2.212f)
                curveTo(14.344f, 2.353f, 14.412f, 2.534f, 14.412f, 2.756f)
                verticalLineTo(6.829f)
                horizontalLineTo(14.444f)
                curveTo(14.715f, 6.342f, 15.085f, 5.96f, 15.556f, 5.685f)
                curveTo(16.032f, 5.409f, 16.565f, 5.271f, 17.154f, 5.271f)
                curveTo(18.22f, 5.271f, 19.08f, 5.668f, 19.734f, 6.463f)
                curveTo(20.389f, 7.259f, 20.716f, 8.316f, 20.716f, 9.636f)
                curveTo(20.716f, 9.812f, 20.71f, 9.983f, 20.699f, 10.15f)
                lineTo(20.413f, 9.864f)
                curveTo(20.075f, 9.527f, 19.676f, 9.288f, 19.252f, 9.149f)
                curveTo(19.189f, 8.417f, 18.979f, 7.819f, 18.623f, 7.356f)
                curveTo(18.19f, 6.793f, 17.6f, 6.512f, 16.854f, 6.512f)
                curveTo(16.135f, 6.512f, 15.545f, 6.802f, 15.085f, 7.38f)
                curveTo(14.631f, 7.954f, 14.404f, 8.706f, 14.404f, 9.636f)
                curveTo(14.404f, 10.302f, 14.519f, 10.875f, 14.748f, 11.358f)
                close()
                moveTo(17.211f, 21.271f)
                lineTo(11.73f, 15.79f)
                lineTo(10.573f, 16.948f)
                curveTo(9.81f, 17.71f, 9.81f, 18.945f, 10.571f, 19.707f)
                lineTo(13.295f, 22.431f)
                curveTo(13.632f, 22.768f, 14.062f, 22.955f, 14.503f, 22.994f)
                lineTo(14.5f, 23.001f)
                horizontalLineTo(20.002f)
                curveTo(20.416f, 23.001f, 20.752f, 22.665f, 20.752f, 22.251f)
                curveTo(20.752f, 21.837f, 20.416f, 21.501f, 20.002f, 21.501f)
                horizontalLineTo(16.982f)
                lineTo(17.211f, 21.271f)
                close()
            }
        }.build()

        return _TextClearFormatting!!
    }

@Suppress("ObjectPropertyName")
private var _TextClearFormatting: ImageVector? = null

@Preview
@Composable
private fun TextClearFormattingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextClearFormatting, contentDescription = null)
    }
}
