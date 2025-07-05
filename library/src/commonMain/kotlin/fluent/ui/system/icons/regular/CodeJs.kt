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
 * CodeJs Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent Javascript language.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_js_16_regular.svg)
 * 
 * @return The [ImageVector] for the CodeJs icon.
 */
public val FluentIcons.Regular.CodeJs: ImageVector
    get() {
        if (_codeJs != null) {
            return _codeJs!!
        }
        _codeJs = Builder(name = "CodeJs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 4.501f)
                verticalLineTo(9.501f)
                curveTo(7.0f, 9.829f, 6.935f, 10.154f, 6.81f, 10.458f)
                curveTo(6.684f, 10.761f, 6.5f, 11.036f, 6.268f, 11.269f)
                curveTo(6.036f, 11.501f, 5.76f, 11.685f, 5.457f, 11.81f)
                curveTo(5.153f, 11.936f, 4.828f, 12.001f, 4.5f, 12.001f)
                curveTo(3.837f, 12.001f, 3.201f, 11.737f, 2.732f, 11.269f)
                curveTo(2.263f, 10.8f, 2.0f, 10.164f, 2.0f, 9.501f)
                verticalLineTo(9.001f)
                curveTo(2.0f, 8.868f, 2.053f, 8.741f, 2.146f, 8.647f)
                curveTo(2.24f, 8.553f, 2.367f, 8.501f, 2.5f, 8.501f)
                curveTo(2.633f, 8.501f, 2.76f, 8.553f, 2.854f, 8.647f)
                curveTo(2.947f, 8.741f, 3.0f, 8.868f, 3.0f, 9.001f)
                verticalLineTo(9.501f)
                curveTo(3.0f, 9.899f, 3.158f, 10.28f, 3.439f, 10.561f)
                curveTo(3.721f, 10.843f, 4.102f, 11.001f, 4.5f, 11.001f)
                curveTo(4.898f, 11.001f, 5.279f, 10.843f, 5.561f, 10.561f)
                curveTo(5.842f, 10.28f, 6.0f, 9.899f, 6.0f, 9.501f)
                verticalLineTo(4.501f)
                curveTo(6.0f, 4.368f, 6.053f, 4.241f, 6.146f, 4.147f)
                curveTo(6.24f, 4.053f, 6.367f, 4.001f, 6.5f, 4.001f)
                curveTo(6.633f, 4.001f, 6.76f, 4.053f, 6.854f, 4.147f)
                curveTo(6.947f, 4.241f, 7.0f, 4.368f, 7.0f, 4.501f)
                close()
                moveTo(10.676f, 7.533f)
                curveTo(9.633f, 7.142f, 9.0f, 6.86f, 9.0f, 6.251f)
                curveTo(9.0f, 5.328f, 9.808f, 5.001f, 10.5f, 5.001f)
                curveTo(11.192f, 5.001f, 12.0f, 5.328f, 12.0f, 6.251f)
                curveTo(12.0f, 6.383f, 12.053f, 6.511f, 12.146f, 6.604f)
                curveTo(12.24f, 6.698f, 12.367f, 6.751f, 12.5f, 6.751f)
                curveTo(12.633f, 6.751f, 12.76f, 6.698f, 12.854f, 6.604f)
                curveTo(12.947f, 6.511f, 13.0f, 6.383f, 13.0f, 6.251f)
                curveTo(12.997f, 5.934f, 12.929f, 5.622f, 12.799f, 5.334f)
                curveTo(12.669f, 5.046f, 12.48f, 4.787f, 12.245f, 4.576f)
                curveTo(12.01f, 4.364f, 11.733f, 4.204f, 11.433f, 4.105f)
                curveTo(10.875f, 3.921f, 10.125f, 3.921f, 9.567f, 4.105f)
                curveTo(9.267f, 4.204f, 8.99f, 4.364f, 8.755f, 4.576f)
                curveTo(8.52f, 4.787f, 8.331f, 5.046f, 8.201f, 5.334f)
                curveTo(8.071f, 5.622f, 8.003f, 5.934f, 8.0f, 6.251f)
                curveTo(8.0f, 7.598f, 9.289f, 8.081f, 10.324f, 8.469f)
                curveTo(11.359f, 8.857f, 12.0f, 9.142f, 12.0f, 9.751f)
                curveTo(12.0f, 10.674f, 11.192f, 11.001f, 10.5f, 11.001f)
                curveTo(9.808f, 11.001f, 9.0f, 10.674f, 9.0f, 9.751f)
                curveTo(9.0f, 9.618f, 8.947f, 9.491f, 8.854f, 9.397f)
                curveTo(8.76f, 9.303f, 8.633f, 9.251f, 8.5f, 9.251f)
                curveTo(8.367f, 9.251f, 8.24f, 9.303f, 8.146f, 9.397f)
                curveTo(8.053f, 9.491f, 8.0f, 9.618f, 8.0f, 9.751f)
                curveTo(8.003f, 10.067f, 8.071f, 10.379f, 8.201f, 10.668f)
                curveTo(8.331f, 10.956f, 8.52f, 11.214f, 8.755f, 11.426f)
                curveTo(8.99f, 11.637f, 9.267f, 11.798f, 9.567f, 11.897f)
                curveTo(9.867f, 11.996f, 10.185f, 12.031f, 10.5f, 12.001f)
                curveTo(10.815f, 12.031f, 11.132f, 11.996f, 11.433f, 11.897f)
                curveTo(11.733f, 11.798f, 12.01f, 11.637f, 12.245f, 11.426f)
                curveTo(12.48f, 11.214f, 12.669f, 10.956f, 12.799f, 10.668f)
                curveTo(12.929f, 10.379f, 12.997f, 10.067f, 13.0f, 9.751f)
                curveTo(13.0f, 8.401f, 11.711f, 7.921f, 10.676f, 7.533f)
                close()
            }
        }
        .build()
        return _codeJs!!
    }

@Suppress("ObjectPropertyName")
private var _codeJs: ImageVector? = null

@Preview
@Composable
private fun CodeJsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeJs, contentDescription = "CodeJs Icon")
    }
}

