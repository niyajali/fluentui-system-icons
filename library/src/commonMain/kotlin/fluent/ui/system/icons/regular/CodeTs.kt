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
 * CodeTs icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: code, ts
 * - Source: ic_fluent_code_ts_16_regular.svg
 * 
 * @return The [ImageVector] for the CodeTs icon.
 */
public val FluentIcons.Regular.CodeTs: ImageVector
    get() {
        if (_codeTs != null) {
            return _codeTs!!
        }
        _codeTs = Builder(name = "CodeTs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.751f)
                curveTo(12.997f, 10.067f, 12.929f, 10.379f, 12.799f, 10.668f)
                curveTo(12.669f, 10.956f, 12.48f, 11.214f, 12.245f, 11.426f)
                curveTo(12.01f, 11.637f, 11.733f, 11.798f, 11.433f, 11.897f)
                curveTo(11.132f, 11.996f, 10.815f, 12.031f, 10.5f, 12.001f)
                curveTo(10.185f, 12.031f, 9.867f, 11.996f, 9.567f, 11.897f)
                curveTo(9.267f, 11.798f, 8.99f, 11.637f, 8.755f, 11.426f)
                curveTo(8.52f, 11.214f, 8.331f, 10.956f, 8.201f, 10.668f)
                curveTo(8.071f, 10.379f, 8.003f, 10.067f, 8.0f, 9.751f)
                curveTo(8.0f, 9.618f, 8.053f, 9.491f, 8.146f, 9.397f)
                curveTo(8.24f, 9.303f, 8.367f, 9.251f, 8.5f, 9.251f)
                curveTo(8.633f, 9.251f, 8.76f, 9.303f, 8.854f, 9.397f)
                curveTo(8.947f, 9.491f, 9.0f, 9.618f, 9.0f, 9.751f)
                curveTo(9.0f, 10.674f, 9.808f, 11.001f, 10.5f, 11.001f)
                curveTo(11.192f, 11.001f, 12.0f, 10.674f, 12.0f, 9.751f)
                curveTo(12.0f, 9.142f, 11.367f, 8.86f, 10.324f, 8.469f)
                curveTo(9.281f, 8.078f, 8.0f, 7.601f, 8.0f, 6.251f)
                curveTo(8.003f, 5.935f, 8.071f, 5.622f, 8.201f, 5.334f)
                curveTo(8.331f, 5.046f, 8.52f, 4.787f, 8.755f, 4.576f)
                curveTo(8.99f, 4.364f, 9.267f, 4.204f, 9.567f, 4.105f)
                curveTo(9.867f, 4.006f, 10.185f, 3.97f, 10.5f, 4.001f)
                curveTo(10.815f, 3.97f, 11.132f, 4.006f, 11.433f, 4.105f)
                curveTo(11.733f, 4.204f, 12.01f, 4.364f, 12.245f, 4.576f)
                curveTo(12.48f, 4.787f, 12.669f, 5.046f, 12.799f, 5.334f)
                curveTo(12.929f, 5.622f, 12.997f, 5.935f, 13.0f, 6.251f)
                curveTo(13.0f, 6.383f, 12.947f, 6.511f, 12.854f, 6.604f)
                curveTo(12.76f, 6.698f, 12.633f, 6.751f, 12.5f, 6.751f)
                curveTo(12.367f, 6.751f, 12.24f, 6.698f, 12.146f, 6.604f)
                curveTo(12.053f, 6.511f, 12.0f, 6.383f, 12.0f, 6.251f)
                curveTo(12.0f, 5.328f, 11.192f, 5.001f, 10.5f, 5.001f)
                curveTo(9.808f, 5.001f, 9.0f, 5.328f, 9.0f, 6.251f)
                curveTo(9.0f, 6.86f, 9.633f, 7.142f, 10.676f, 7.533f)
                curveTo(11.719f, 7.924f, 13.0f, 8.401f, 13.0f, 9.751f)
                close()
                moveTo(6.75f, 4.001f)
                horizontalLineTo(2.25f)
                curveTo(2.117f, 4.001f, 1.99f, 4.053f, 1.896f, 4.147f)
                curveTo(1.803f, 4.241f, 1.75f, 4.368f, 1.75f, 4.501f)
                curveTo(1.75f, 4.633f, 1.803f, 4.761f, 1.896f, 4.854f)
                curveTo(1.99f, 4.948f, 2.117f, 5.001f, 2.25f, 5.001f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.501f)
                curveTo(4.0f, 11.633f, 4.053f, 11.761f, 4.146f, 11.854f)
                curveTo(4.24f, 11.948f, 4.367f, 12.001f, 4.5f, 12.001f)
                curveTo(4.633f, 12.001f, 4.76f, 11.948f, 4.854f, 11.854f)
                curveTo(4.947f, 11.761f, 5.0f, 11.633f, 5.0f, 11.501f)
                verticalLineTo(5.001f)
                horizontalLineTo(6.75f)
                curveTo(6.883f, 5.001f, 7.01f, 4.948f, 7.104f, 4.854f)
                curveTo(7.197f, 4.761f, 7.25f, 4.633f, 7.25f, 4.501f)
                curveTo(7.25f, 4.368f, 7.197f, 4.241f, 7.104f, 4.147f)
                curveTo(7.01f, 4.053f, 6.883f, 4.001f, 6.75f, 4.001f)
                close()
            }
        }
        .build()
        return _codeTs!!
    }

@Suppress("ObjectPropertyName")
private var _codeTs: ImageVector? = null

@Preview
@Composable
private fun CodeTsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeTs, contentDescription = null)
    }
}

