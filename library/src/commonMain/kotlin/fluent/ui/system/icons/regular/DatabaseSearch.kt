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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DatabaseSearch: ImageVector
    get() {
        if (_DatabaseSearch != null) {
            return _DatabaseSearch!!
        }
        _DatabaseSearch = ImageVector.Builder(
            name = "Regular.DatabaseSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 6f)
                curveTo(4f, 5.309f, 4.315f, 4.707f, 4.774f, 4.22f)
                curveTo(5.229f, 3.738f, 5.853f, 3.337f, 6.567f, 3.018f)
                curveTo(7.996f, 2.377f, 9.917f, 2f, 12f, 2f)
                curveTo(14.083f, 2f, 16.004f, 2.377f, 17.433f, 3.018f)
                curveTo(18.147f, 3.337f, 18.771f, 3.738f, 19.226f, 4.22f)
                curveTo(19.685f, 4.707f, 20f, 5.309f, 20f, 6f)
                verticalLineTo(12.257f)
                curveTo(19.554f, 11.889f, 19.048f, 11.589f, 18.5f, 11.375f)
                verticalLineTo(8.392f)
                curveTo(18.179f, 8.613f, 17.819f, 8.809f, 17.433f, 8.982f)
                curveTo(16.004f, 9.623f, 14.083f, 10f, 12f, 10f)
                curveTo(9.917f, 10f, 7.996f, 9.623f, 6.567f, 8.982f)
                curveTo(6.181f, 8.809f, 5.821f, 8.613f, 5.5f, 8.392f)
                verticalLineTo(18f)
                curveTo(5.5f, 18.207f, 5.59f, 18.459f, 5.865f, 18.75f)
                curveTo(6.144f, 19.046f, 6.582f, 19.346f, 7.18f, 19.614f)
                curveTo(8.375f, 20.149f, 10.079f, 20.5f, 12f, 20.5f)
                curveTo(12.24f, 20.5f, 12.476f, 20.494f, 12.708f, 20.484f)
                curveTo(13.311f, 21.058f, 14.044f, 21.496f, 14.858f, 21.751f)
                curveTo(13.967f, 21.913f, 13.002f, 22f, 12f, 22f)
                curveTo(9.917f, 22f, 7.996f, 21.623f, 6.567f, 20.983f)
                curveTo(5.853f, 20.663f, 5.229f, 20.262f, 4.774f, 19.78f)
                curveTo(4.315f, 19.293f, 4f, 18.691f, 4f, 18f)
                verticalLineTo(6f)
                close()
                moveTo(5.5f, 6f)
                curveTo(5.5f, 6.207f, 5.59f, 6.459f, 5.865f, 6.75f)
                curveTo(6.144f, 7.046f, 6.582f, 7.345f, 7.18f, 7.614f)
                curveTo(8.375f, 8.149f, 10.079f, 8.5f, 12f, 8.5f)
                curveTo(13.921f, 8.5f, 15.625f, 8.149f, 16.82f, 7.614f)
                curveTo(17.418f, 7.345f, 17.856f, 7.046f, 18.135f, 6.75f)
                curveTo(18.41f, 6.459f, 18.5f, 6.207f, 18.5f, 6f)
                curveTo(18.5f, 5.793f, 18.41f, 5.541f, 18.135f, 5.25f)
                curveTo(17.856f, 4.954f, 17.418f, 4.654f, 16.82f, 4.386f)
                curveTo(15.625f, 3.851f, 13.921f, 3.5f, 12f, 3.5f)
                curveTo(10.079f, 3.5f, 8.375f, 3.851f, 7.18f, 4.386f)
                curveTo(6.582f, 4.654f, 6.144f, 4.954f, 5.865f, 5.25f)
                curveTo(5.59f, 5.541f, 5.5f, 5.793f, 5.5f, 6f)
                close()
                moveTo(16.5f, 21f)
                curveTo(17.472f, 21f, 18.372f, 20.692f, 19.107f, 20.168f)
                lineTo(21.72f, 22.78f)
                curveTo(22.013f, 23.073f, 22.487f, 23.073f, 22.78f, 22.78f)
                curveTo(23.073f, 22.487f, 23.073f, 22.013f, 22.78f, 21.72f)
                lineTo(20.168f, 19.107f)
                curveTo(20.692f, 18.372f, 21f, 17.472f, 21f, 16.5f)
                curveTo(21f, 14.015f, 18.985f, 12f, 16.5f, 12f)
                curveTo(14.015f, 12f, 12f, 14.015f, 12f, 16.5f)
                curveTo(12f, 18.985f, 14.015f, 21f, 16.5f, 21f)
                close()
                moveTo(16.5f, 19.5f)
                curveTo(14.843f, 19.5f, 13.5f, 18.157f, 13.5f, 16.5f)
                curveTo(13.5f, 14.843f, 14.843f, 13.5f, 16.5f, 13.5f)
                curveTo(18.157f, 13.5f, 19.5f, 14.843f, 19.5f, 16.5f)
                curveTo(19.5f, 18.157f, 18.157f, 19.5f, 16.5f, 19.5f)
                close()
            }
        }.build()

        return _DatabaseSearch!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseSearch: ImageVector? = null

@Preview
@Composable
private fun DatabaseSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DatabaseSearch, contentDescription = null)
    }
}
