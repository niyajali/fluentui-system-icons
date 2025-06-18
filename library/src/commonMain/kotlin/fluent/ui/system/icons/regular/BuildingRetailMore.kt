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

public val FluentUi.Regular.BuildingRetailMore: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BuildingRetailMore",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.75f, 16f)
            curveTo(8.44f, 16f, 9f, 15.44f, 9f, 14.75f)
            curveTo(9f, 14.06f, 8.44f, 13.5f, 7.75f, 13.5f)
            curveTo(7.06f, 13.5f, 6.5f, 14.06f, 6.5f, 14.75f)
            curveTo(6.5f, 15.44f, 7.06f, 16f, 7.75f, 16f)
            close()
            moveTo(13.25f, 14.75f)
            curveTo(13.25f, 15.44f, 12.69f, 16f, 12f, 16f)
            curveTo(11.31f, 16f, 10.75f, 15.44f, 10.75f, 14.75f)
            curveTo(10.75f, 14.06f, 11.31f, 13.5f, 12f, 13.5f)
            curveTo(12.69f, 13.5f, 13.25f, 14.06f, 13.25f, 14.75f)
            close()
            moveTo(16.25f, 16f)
            curveTo(16.94f, 16f, 17.5f, 15.44f, 17.5f, 14.75f)
            curveTo(17.5f, 14.06f, 16.94f, 13.5f, 16.25f, 13.5f)
            curveTo(15.56f, 13.5f, 15f, 14.06f, 15f, 14.75f)
            curveTo(15f, 15.44f, 15.56f, 16f, 16.25f, 16f)
            close()
            moveTo(4.873f, 3.633f)
            curveTo(5.206f, 3.232f, 5.699f, 3f, 6.22f, 3f)
            horizontalLineTo(17.78f)
            curveTo(18.301f, 3f, 18.795f, 3.232f, 19.128f, 3.633f)
            lineTo(22.709f, 7.952f)
            curveTo(23.384f, 8.767f, 22.805f, 10f, 21.746f, 10f)
            horizontalLineTo(21f)
            verticalLineTo(18.75f)
            curveTo(21f, 20.131f, 19.881f, 21.25f, 18.5f, 21.25f)
            horizontalLineTo(5.5f)
            curveTo(4.119f, 21.25f, 3f, 20.131f, 3f, 18.75f)
            verticalLineTo(10f)
            horizontalLineTo(2.254f)
            curveTo(1.196f, 10f, 0.617f, 8.767f, 1.292f, 7.952f)
            lineTo(4.873f, 3.633f)
            close()
            moveTo(6.22f, 4.5f)
            curveTo(6.146f, 4.5f, 6.075f, 4.533f, 6.028f, 4.59f)
            lineTo(2.786f, 8.5f)
            horizontalLineTo(21.214f)
            lineTo(17.973f, 4.59f)
            curveTo(17.925f, 4.533f, 17.855f, 4.5f, 17.78f, 4.5f)
            horizontalLineTo(6.22f)
            close()
            moveTo(4.5f, 10f)
            verticalLineTo(18.75f)
            curveTo(4.5f, 19.302f, 4.948f, 19.75f, 5.5f, 19.75f)
            horizontalLineTo(18.5f)
            curveTo(19.052f, 19.75f, 19.5f, 19.302f, 19.5f, 18.75f)
            verticalLineTo(10f)
            horizontalLineTo(4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingRetailMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BuildingRetailMore, contentDescription = null)
    }
}
