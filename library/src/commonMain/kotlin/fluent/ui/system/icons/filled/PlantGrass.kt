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

public val FluentIcons.Filled.PlantGrass: ImageVector
    get() {
        if (_PlantGrass != null) {
            return _PlantGrass!!
        }
        _PlantGrass = ImageVector.Builder(
            name = "Filled.PlantGrass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.317f, 3.259f)
                curveTo(8.112f, 3.022f, 7.781f, 2.938f, 7.488f, 3.047f)
                curveTo(7.195f, 3.157f, 7f, 3.437f, 7f, 3.75f)
                verticalLineTo(10.306f)
                curveTo(6.626f, 9.543f, 6.236f, 8.952f, 5.862f, 8.494f)
                curveTo(5.39f, 7.917f, 4.947f, 7.559f, 4.601f, 7.339f)
                curveTo(4.428f, 7.23f, 4.281f, 7.156f, 4.169f, 7.107f)
                curveTo(4.113f, 7.083f, 4.066f, 7.065f, 4.028f, 7.052f)
                curveTo(4.01f, 7.045f, 3.994f, 7.04f, 3.98f, 7.036f)
                lineTo(3.962f, 7.03f)
                lineTo(3.954f, 7.028f)
                lineTo(3.951f, 7.027f)
                lineTo(3.949f, 7.027f)
                curveTo(3.947f, 7.026f, 3.947f, 7.026f, 3.947f, 7.026f)
                curveTo(3.722f, 6.965f, 3.481f, 7.012f, 3.295f, 7.154f)
                curveTo(3.109f, 7.296f, 3f, 7.516f, 3f, 7.75f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(7.75f)
                curveTo(21f, 7.516f, 20.891f, 7.296f, 20.705f, 7.154f)
                curveTo(20.52f, 7.012f, 20.278f, 6.965f, 20.053f, 7.026f)
                curveTo(20.053f, 7.026f, 20.053f, 7.026f, 20.051f, 7.027f)
                lineTo(20.049f, 7.027f)
                lineTo(20.046f, 7.028f)
                lineTo(20.038f, 7.03f)
                lineTo(20.02f, 7.036f)
                curveTo(20.006f, 7.04f, 19.99f, 7.045f, 19.972f, 7.052f)
                curveTo(19.934f, 7.065f, 19.887f, 7.083f, 19.831f, 7.107f)
                curveTo(19.719f, 7.156f, 19.572f, 7.23f, 19.399f, 7.339f)
                curveTo(19.053f, 7.559f, 18.61f, 7.917f, 18.138f, 8.494f)
                curveTo(17.764f, 8.952f, 17.374f, 9.543f, 17f, 10.306f)
                verticalLineTo(3.75f)
                curveTo(17f, 3.437f, 16.806f, 3.157f, 16.512f, 3.047f)
                curveTo(16.219f, 2.938f, 15.888f, 3.022f, 15.683f, 3.259f)
                lineTo(15.682f, 3.261f)
                lineTo(15.679f, 3.264f)
                lineTo(15.67f, 3.274f)
                lineTo(15.639f, 3.311f)
                curveTo(15.612f, 3.343f, 15.574f, 3.388f, 15.526f, 3.448f)
                curveTo(15.43f, 3.566f, 15.293f, 3.738f, 15.127f, 3.959f)
                curveTo(14.795f, 4.401f, 14.344f, 5.038f, 13.86f, 5.827f)
                curveTo(13.235f, 6.849f, 12.548f, 8.139f, 12f, 9.6f)
                curveTo(11.452f, 8.139f, 10.765f, 6.849f, 10.14f, 5.827f)
                curveTo(9.656f, 5.038f, 9.205f, 4.401f, 8.873f, 3.959f)
                curveTo(8.707f, 3.738f, 8.57f, 3.566f, 8.474f, 3.448f)
                curveTo(8.426f, 3.388f, 8.388f, 3.343f, 8.361f, 3.311f)
                lineTo(8.33f, 3.274f)
                lineTo(8.321f, 3.264f)
                lineTo(8.318f, 3.261f)
                lineTo(8.317f, 3.259f)
                close()
            }
        }.build()

        return _PlantGrass!!
    }

@Suppress("ObjectPropertyName")
private var _PlantGrass: ImageVector? = null

@Preview
@Composable
private fun PlantGrassPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PlantGrass, contentDescription = null)
    }
}
