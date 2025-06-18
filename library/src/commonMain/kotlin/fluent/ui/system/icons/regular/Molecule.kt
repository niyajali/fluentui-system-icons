/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Molecule: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Molecule",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
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
            curveTo(15.097f, 16f, 14.287f, 16.399f, 13.737f, 17.03f)
            lineTo(9.851f, 15.087f)
            curveTo(9.948f, 14.741f, 10f, 14.377f, 10f, 14f)
            curveTo(10f, 13.498f, 9.907f, 13.017f, 9.738f, 12.574f)
            lineTo(12.601f, 10.667f)
            curveTo(13.493f, 11.494f, 14.687f, 12f, 16f, 12f)
            close()
            moveTo(16f, 10.5f)
            curveTo(14.067f, 10.5f, 12.5f, 8.933f, 12.5f, 7f)
            curveTo(12.5f, 5.067f, 14.067f, 3.5f, 16f, 3.5f)
            curveTo(17.933f, 3.5f, 19.5f, 5.067f, 19.5f, 7f)
            curveTo(19.5f, 8.933f, 17.933f, 10.5f, 16f, 10.5f)
            close()
            moveTo(6f, 16.5f)
            curveTo(4.619f, 16.5f, 3.5f, 15.381f, 3.5f, 14f)
            curveTo(3.5f, 12.619f, 4.619f, 11.5f, 6f, 11.5f)
            curveTo(7.381f, 11.5f, 8.5f, 12.619f, 8.5f, 14f)
            curveTo(8.5f, 15.381f, 7.381f, 16.5f, 6f, 16.5f)
            close()
            moveTo(17.5f, 19f)
            curveTo(17.5f, 19.828f, 16.828f, 20.5f, 16f, 20.5f)
            curveTo(15.172f, 20.5f, 14.5f, 19.828f, 14.5f, 19f)
            curveTo(14.5f, 18.172f, 15.172f, 17.5f, 16f, 17.5f)
            curveTo(16.828f, 17.5f, 17.5f, 18.172f, 17.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoleculePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Molecule, contentDescription = null)
    }
}
