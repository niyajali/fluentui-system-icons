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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.AnimalRabbit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AnimalRabbit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.531f, 5.437f)
            lineTo(20.956f, 10.874f)
            curveTo(22.348f, 12.268f, 22.348f, 14.529f, 20.956f, 15.923f)
            curveTo(20.05f, 16.831f, 18.776f, 17.148f, 17.614f, 16.873f)
            lineTo(17.614f, 16.997f)
            curveTo(17.614f, 18.103f, 16.719f, 19f, 15.615f, 19f)
            lineTo(13.504f, 19f)
            lineTo(13.505f, 18.252f)
            lineTo(13.5f, 18.084f)
            curveTo(13.417f, 16.699f, 12.312f, 15.59f, 10.93f, 15.503f)
            lineTo(10.756f, 15.498f)
            horizontalLineTo(9.757f)
            lineTo(9.655f, 15.505f)
            curveTo(9.289f, 15.554f, 9.007f, 15.869f, 9.007f, 16.249f)
            curveTo(9.007f, 16.629f, 9.289f, 16.944f, 9.655f, 16.993f)
            lineTo(9.757f, 17f)
            horizontalLineTo(10.756f)
            lineTo(10.884f, 17.007f)
            curveTo(11.472f, 17.066f, 11.939f, 17.535f, 11.999f, 18.124f)
            lineTo(12.006f, 18.252f)
            lineTo(12.005f, 19f)
            lineTo(7.006f, 19f)
            curveTo(5.902f, 19f, 5.007f, 18.103f, 5.007f, 16.997f)
            verticalLineTo(14.493f)
            curveTo(5.007f, 14.302f, 5.019f, 14.115f, 5.041f, 13.931f)
            curveTo(4.867f, 13.971f, 4.686f, 13.992f, 4.499f, 13.992f)
            curveTo(3.119f, 13.992f, 2f, 12.871f, 2f, 11.488f)
            curveTo(2f, 10.105f, 3.119f, 8.984f, 4.499f, 8.984f)
            curveTo(5.646f, 8.984f, 6.613f, 9.758f, 6.906f, 10.814f)
            curveTo(7.639f, 10.292f, 8.536f, 9.985f, 9.505f, 9.985f)
            horizontalLineTo(13.116f)
            curveTo(13.719f, 9.985f, 14.295f, 10.104f, 14.821f, 10.32f)
            curveTo(14.984f, 10.044f, 15.184f, 9.782f, 15.417f, 9.541f)
            lineTo(13.426f, 7.546f)
            curveTo(12.844f, 6.964f, 12.844f, 6.019f, 13.426f, 5.437f)
            curveTo(14.007f, 4.854f, 14.95f, 4.854f, 15.531f, 5.437f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AnimalRabbitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AnimalRabbit, contentDescription = null)
    }
}
