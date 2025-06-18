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

public val FluentIcons.Filled.VehicleCableCar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleCableCar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.15f, 3.007f)
            curveTo(21.56f, 2.951f, 21.938f, 3.239f, 21.993f, 3.65f)
            curveTo(22.049f, 4.06f, 21.761f, 4.438f, 21.351f, 4.493f)
            lineTo(14.5f, 5.419f)
            verticalLineTo(7.25f)
            curveTo(14.5f, 7.894f, 14.313f, 8.495f, 13.989f, 9f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 9f, 20f, 10.455f, 20f, 12.25f)
            verticalLineTo(15.5f)
            horizontalLineTo(4f)
            verticalLineTo(12.25f)
            curveTo(4f, 10.455f, 5.455f, 9f, 7.25f, 9f)
            horizontalLineTo(11.251f)
            curveTo(12.217f, 8.999f, 13f, 8.216f, 13f, 7.25f)
            verticalLineTo(5.622f)
            lineTo(2.851f, 6.993f)
            curveTo(2.44f, 7.049f, 2.062f, 6.761f, 2.007f, 6.351f)
            curveTo(1.951f, 5.94f, 2.239f, 5.562f, 2.65f, 5.507f)
            lineTo(13f, 4.108f)
            verticalLineTo(3.75f)
            curveTo(13f, 3.336f, 13.336f, 3f, 13.75f, 3f)
            curveTo(14.164f, 3f, 14.5f, 3.336f, 14.5f, 3.75f)
            verticalLineTo(3.905f)
            lineTo(21.15f, 3.007f)
            close()
            moveTo(20f, 17f)
            verticalLineTo(18.75f)
            curveTo(20f, 19.993f, 18.993f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 21f, 4f, 19.993f, 4f, 18.75f)
            verticalLineTo(17f)
            horizontalLineTo(20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VehicleCableCarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VehicleCableCar, contentDescription = null)
    }
}
