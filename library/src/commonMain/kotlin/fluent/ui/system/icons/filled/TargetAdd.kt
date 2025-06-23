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

public val FluentIcons.Filled.TargetAdd: ImageVector
    get() {
        if (_TargetAdd != null) {
            return _TargetAdd!!
        }
        _TargetAdd = ImageVector.Builder(
            name = "Filled.TargetAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 12f)
                curveTo(4f, 16.247f, 7.31f, 19.722f, 11.492f, 19.984f)
                curveTo(11.798f, 20.725f, 12.238f, 21.397f, 12.781f, 21.97f)
                curveTo(12.523f, 21.99f, 12.263f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 12.263f, 21.99f, 12.523f, 21.97f, 12.781f)
                curveTo(21.397f, 12.238f, 20.725f, 11.798f, 19.984f, 11.492f)
                curveTo(19.722f, 7.31f, 16.247f, 4f, 12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                close()
                moveTo(11.194f, 15.919f)
                curveTo(9.371f, 15.546f, 8f, 13.933f, 8f, 12f)
                curveTo(8f, 9.791f, 9.791f, 8f, 12f, 8f)
                curveTo(13.933f, 8f, 15.546f, 9.371f, 15.919f, 11.194f)
                curveTo(16.425f, 11.067f, 16.955f, 11f, 17.5f, 11f)
                curveTo(17.641f, 11f, 17.781f, 11.005f, 17.919f, 11.013f)
                curveTo(17.449f, 8.169f, 14.978f, 6f, 12f, 6f)
                curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
                curveTo(6f, 14.978f, 8.169f, 17.449f, 11.013f, 17.919f)
                curveTo(11.005f, 17.781f, 11f, 17.641f, 11f, 17.5f)
                curveTo(11f, 16.955f, 11.067f, 16.425f, 11.194f, 15.919f)
                close()
                moveTo(12.022f, 14f)
                lineTo(12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
                lineTo(14f, 12.022f)
                curveTo(13.206f, 12.53f, 12.53f, 13.206f, 12.022f, 14f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(18.001f, 20.503f)
                lineTo(18.001f, 18f)
                horizontalLineTo(20.503f)
                curveTo(20.779f, 18f, 21.003f, 17.776f, 21.003f, 17.5f)
                curveTo(21.003f, 17.224f, 20.779f, 17f, 20.503f, 17f)
                horizontalLineTo(18f)
                lineTo(18f, 14.499f)
                curveTo(18f, 14.223f, 17.776f, 13.999f, 17.5f, 13.999f)
                curveTo(17.224f, 13.999f, 17f, 14.223f, 17f, 14.499f)
                lineTo(17f, 17f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 17f, 13.996f, 17.224f, 13.996f, 17.5f)
                curveTo(13.996f, 17.776f, 14.22f, 18f, 14.496f, 18f)
                horizontalLineTo(17.001f)
                lineTo(17.001f, 20.503f)
                curveTo(17.001f, 20.78f, 17.225f, 21.003f, 17.501f, 21.003f)
                curveTo(17.777f, 21.003f, 18.001f, 20.78f, 18.001f, 20.503f)
                close()
            }
        }.build()

        return _TargetAdd!!
    }

@Suppress("ObjectPropertyName")
private var _TargetAdd: ImageVector? = null

@Preview
@Composable
private fun TargetAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TargetAdd, contentDescription = null)
    }
}
