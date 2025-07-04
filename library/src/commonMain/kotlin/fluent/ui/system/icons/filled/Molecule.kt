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

public val FluentIcons.Filled.Molecule: ImageVector
    get() {
        if (_Molecule != null) {
            return _Molecule!!
        }
        _Molecule = ImageVector.Builder(
            name = "Filled.Molecule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 12f)
                curveTo(18.761f, 12f, 21f, 9.761f, 21f, 7f)
                curveTo(21f, 4.239f, 18.761f, 2f, 16f, 2f)
                curveTo(13.239f, 2f, 11f, 4.239f, 11f, 7f)
                curveTo(11f, 7.906f, 11.241f, 8.756f, 11.663f, 9.49f)
                lineTo(8.949f, 11.298f)
                curveTo(8.218f, 10.5f, 7.167f, 10f, 6f, 10f)
                curveTo(3.791f, 10f, 2f, 11.791f, 2f, 14f)
                curveTo(2f, 16.209f, 3.791f, 18f, 6f, 18f)
                curveTo(7.296f, 18f, 8.448f, 17.384f, 9.179f, 16.428f)
                lineTo(13.066f, 18.371f)
                curveTo(13.023f, 18.574f, 13f, 18.784f, 13f, 19f)
                curveTo(13f, 20.657f, 14.343f, 22f, 16f, 22f)
                curveTo(17.657f, 22f, 19f, 20.657f, 19f, 19f)
                curveTo(19f, 17.343f, 17.657f, 16f, 16f, 16f)
                curveTo(15.097f, 16f, 14.288f, 16.399f, 13.738f, 17.03f)
                lineTo(9.851f, 15.087f)
                curveTo(9.948f, 14.741f, 10f, 14.377f, 10f, 14f)
                curveTo(10f, 13.498f, 9.907f, 13.017f, 9.738f, 12.574f)
                lineTo(12.601f, 10.667f)
                curveTo(13.493f, 11.494f, 14.687f, 12f, 16f, 12f)
                close()
            }
        }.build()

        return _Molecule!!
    }

@Suppress("ObjectPropertyName")
private var _Molecule: ImageVector? = null

@Preview
@Composable
private fun MoleculePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Molecule, contentDescription = null)
    }
}
