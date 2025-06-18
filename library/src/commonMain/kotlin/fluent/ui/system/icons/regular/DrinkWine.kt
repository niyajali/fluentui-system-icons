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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.DrinkWine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DrinkWine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.929f, 9.754f)
            curveTo(16.007f, 9.347f, 15.74f, 8.954f, 15.333f, 8.877f)
            curveTo(14.926f, 8.799f, 14.533f, 9.066f, 14.455f, 9.473f)
            curveTo(14.41f, 9.714f, 14.329f, 9.942f, 14.219f, 10.153f)
            curveTo(14.082f, 10.416f, 13.9f, 10.651f, 13.683f, 10.849f)
            curveTo(13.472f, 11.041f, 13.229f, 11.197f, 12.963f, 11.308f)
            curveTo(12.82f, 11.368f, 12.67f, 11.415f, 12.514f, 11.447f)
            curveTo(12.109f, 11.532f, 11.849f, 11.929f, 11.933f, 12.335f)
            curveTo(12.018f, 12.74f, 12.415f, 13f, 12.821f, 12.916f)
            curveTo(13.07f, 12.863f, 13.311f, 12.788f, 13.541f, 12.692f)
            curveTo(13.968f, 12.514f, 14.357f, 12.264f, 14.693f, 11.958f)
            curveTo(15.039f, 11.642f, 15.33f, 11.267f, 15.549f, 10.847f)
            curveTo(15.725f, 10.508f, 15.855f, 10.141f, 15.929f, 9.754f)
            close()
            moveTo(6f, 2.75f)
            curveTo(6f, 2.336f, 6.336f, 2f, 6.75f, 2f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 2f, 18f, 2.336f, 18f, 2.75f)
            verticalLineTo(9.25f)
            curveTo(18f, 12.448f, 15.598f, 15.085f, 12.5f, 15.455f)
            verticalLineTo(20.509f)
            lineTo(15.248f, 20.5f)
            curveTo(15.662f, 20.499f, 15.999f, 20.833f, 16f, 21.248f)
            curveTo(16.001f, 21.662f, 15.667f, 21.999f, 15.252f, 22f)
            lineTo(11.752f, 22.011f)
            lineTo(11.747f, 22.011f)
            lineTo(8.747f, 22f)
            curveTo(8.333f, 21.999f, 7.998f, 21.661f, 8f, 21.247f)
            curveTo(8.002f, 20.833f, 8.339f, 20.499f, 8.753f, 20.5f)
            lineTo(11f, 20.508f)
            verticalLineTo(15.451f)
            curveTo(8.179f, 15.084f, 6f, 12.671f, 6f, 9.75f)
            verticalLineTo(2.75f)
            close()
            moveTo(7.5f, 3.5f)
            verticalLineTo(6.25f)
            horizontalLineTo(16.5f)
            verticalLineTo(3.5f)
            horizontalLineTo(7.5f)
            close()
            moveTo(7.5f, 9.75f)
            curveTo(7.5f, 12.097f, 9.403f, 14f, 11.75f, 14f)
            curveTo(14.373f, 14f, 16.5f, 11.873f, 16.5f, 9.25f)
            verticalLineTo(7.75f)
            horizontalLineTo(7.5f)
            verticalLineTo(9.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrinkWinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DrinkWine, contentDescription = null)
    }
}
