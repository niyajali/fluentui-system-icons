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

public val FluentIcons.Regular.Eye: ImageVector
    get() {
        if (_Eye != null) {
            return _Eye!!
        }
        _Eye = ImageVector.Builder(
            name = "Regular.Eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 9.005f)
                curveTo(14.209f, 9.005f, 16f, 10.795f, 16f, 13.005f)
                curveTo(16f, 15.214f, 14.209f, 17.005f, 12f, 17.005f)
                curveTo(9.791f, 17.005f, 8f, 15.214f, 8f, 13.005f)
                curveTo(8f, 10.795f, 9.791f, 9.005f, 12f, 9.005f)
                close()
                moveTo(12f, 10.505f)
                curveTo(10.619f, 10.505f, 9.5f, 11.624f, 9.5f, 13.005f)
                curveTo(9.5f, 14.385f, 10.619f, 15.505f, 12f, 15.505f)
                curveTo(13.381f, 15.505f, 14.5f, 14.385f, 14.5f, 13.005f)
                curveTo(14.5f, 11.624f, 13.381f, 10.505f, 12f, 10.505f)
                close()
                moveTo(12f, 5.5f)
                curveTo(16.613f, 5.5f, 20.596f, 8.65f, 21.701f, 13.064f)
                curveTo(21.802f, 13.466f, 21.557f, 13.873f, 21.156f, 13.974f)
                curveTo(20.754f, 14.075f, 20.347f, 13.83f, 20.246f, 13.429f)
                curveTo(19.307f, 9.678f, 15.921f, 7f, 12f, 7f)
                curveTo(8.077f, 7f, 4.69f, 9.68f, 3.753f, 13.433f)
                curveTo(3.652f, 13.835f, 3.245f, 14.079f, 2.843f, 13.979f)
                curveTo(2.441f, 13.879f, 2.197f, 13.472f, 2.297f, 13.07f)
                curveTo(3.401f, 8.653f, 7.384f, 5.5f, 12f, 5.5f)
                close()
            }
        }.build()

        return _Eye!!
    }

@Suppress("ObjectPropertyName")
private var _Eye: ImageVector? = null

@Preview
@Composable
private fun EyePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Eye, contentDescription = null)
    }
}
