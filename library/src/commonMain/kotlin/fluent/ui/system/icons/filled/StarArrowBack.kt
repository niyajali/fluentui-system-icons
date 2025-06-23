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

public val FluentIcons.Filled.StarArrowBack: ImageVector
    get() {
        if (_StarArrowBack != null) {
            return _StarArrowBack!!
        }
        _StarArrowBack = ImageVector.Builder(
            name = "Filled.StarArrowBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.788f, 3.103f)
                curveTo(11.283f, 2.099f, 12.714f, 2.099f, 13.209f, 3.103f)
                lineTo(15.567f, 7.88f)
                lineTo(20.84f, 8.646f)
                curveTo(21.947f, 8.807f, 22.389f, 10.168f, 21.588f, 10.949f)
                lineTo(20.683f, 11.831f)
                curveTo(19.742f, 11.302f, 18.656f, 11f, 17.5f, 11f)
                curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
                curveTo(11f, 18.11f, 11.084f, 18.701f, 11.241f, 19.261f)
                lineTo(7.283f, 21.343f)
                curveTo(6.292f, 21.863f, 5.135f, 21.022f, 5.324f, 19.919f)
                lineTo(6.224f, 14.668f)
                lineTo(2.409f, 10.949f)
                curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
                lineTo(8.43f, 7.88f)
                lineTo(10.788f, 3.103f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(16.354f, 15.354f)
                curveTo(16.549f, 15.158f, 16.549f, 14.842f, 16.354f, 14.646f)
                curveTo(16.158f, 14.451f, 15.842f, 14.451f, 15.646f, 14.646f)
                lineTo(14.146f, 16.146f)
                curveTo(13.951f, 16.342f, 13.951f, 16.658f, 14.146f, 16.854f)
                lineTo(15.646f, 18.354f)
                curveTo(15.842f, 18.549f, 16.158f, 18.549f, 16.354f, 18.354f)
                curveTo(16.549f, 18.158f, 16.549f, 17.842f, 16.354f, 17.646f)
                lineTo(15.707f, 17f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 17f, 20f, 18.007f, 20f, 19.25f)
                verticalLineTo(19.5f)
                curveTo(20f, 19.776f, 20.224f, 20f, 20.5f, 20f)
                curveTo(20.776f, 20f, 21f, 19.776f, 21f, 19.5f)
                verticalLineTo(19.25f)
                curveTo(21f, 17.455f, 19.545f, 16f, 17.75f, 16f)
                horizontalLineTo(15.707f)
                lineTo(16.354f, 15.354f)
                close()
            }
        }.build()

        return _StarArrowBack!!
    }

@Suppress("ObjectPropertyName")
private var _StarArrowBack: ImageVector? = null

@Preview
@Composable
private fun StarArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StarArrowBack, contentDescription = null)
    }
}
