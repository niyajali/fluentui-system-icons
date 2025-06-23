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

public val FluentIcons.Filled.DatabaseSearch: ImageVector
    get() {
        if (_DatabaseSearch != null) {
            return _DatabaseSearch!!
        }
        _DatabaseSearch = ImageVector.Builder(
            name = "Filled.DatabaseSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 10f)
                curveTo(16.418f, 10f, 20f, 8.209f, 20f, 6f)
                curveTo(20f, 3.791f, 16.418f, 2f, 12f, 2f)
                curveTo(7.582f, 2f, 4f, 3.791f, 4f, 6f)
                curveTo(4f, 8.209f, 7.582f, 10f, 12f, 10f)
                close()
                moveTo(18.328f, 10.17f)
                curveTo(18.916f, 9.876f, 19.498f, 9.504f, 20f, 9.053f)
                verticalLineTo(12.257f)
                curveTo(19.049f, 11.472f, 17.83f, 11f, 16.5f, 11f)
                curveTo(16.325f, 11f, 16.151f, 11.008f, 15.98f, 11.024f)
                curveTo(16.836f, 10.807f, 17.628f, 10.52f, 18.328f, 10.17f)
                close()
                moveTo(11f, 16.5f)
                curveTo(11f, 18.956f, 12.609f, 21.036f, 14.831f, 21.742f)
                curveTo(13.951f, 21.909f, 12.997f, 22f, 12f, 22f)
                curveTo(7.582f, 22f, 4f, 20.209f, 4f, 18f)
                verticalLineTo(9.053f)
                curveTo(4.502f, 9.504f, 5.084f, 9.876f, 5.672f, 10.17f)
                curveTo(7.369f, 11.019f, 9.608f, 11.5f, 12f, 11.5f)
                curveTo(12.958f, 11.5f, 13.892f, 11.423f, 14.777f, 11.275f)
                curveTo(12.583f, 11.998f, 11f, 14.064f, 11f, 16.5f)
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
        Image(imageVector = FluentIcons.Filled.DatabaseSearch, contentDescription = null)
    }
}
