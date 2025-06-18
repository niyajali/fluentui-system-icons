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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.BuildingRetailShield: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BuildingRetailShield",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.5f, 11.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(10.715f)
            curveTo(16.144f, 10.976f, 15.69f, 11.263f, 15.167f, 11.5f)
            horizontalLineTo(7.5f)
            close()
            moveTo(18f, 8.75f)
            verticalLineTo(9.967f)
            curveTo(18.37f, 9.967f, 18.741f, 10.094f, 19.036f, 10.347f)
            curveTo(19.44f, 10.693f, 20.133f, 11.209f, 21f, 11.572f)
            verticalLineTo(6.732f)
            curveTo(21.598f, 6.387f, 22f, 5.74f, 22f, 5f)
            curveTo(22f, 3.895f, 21.105f, 3f, 20f, 3f)
            horizontalLineTo(4f)
            curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
            curveTo(2f, 5.74f, 2.402f, 6.387f, 3f, 6.732f)
            verticalLineTo(20.25f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            horizontalLineTo(6f)
            verticalLineTo(15.75f)
            curveTo(6f, 15.336f, 6.336f, 15f, 6.75f, 15f)
            horizontalLineTo(10.75f)
            curveTo(11.164f, 15f, 11.5f, 15.336f, 11.5f, 15.75f)
            verticalLineTo(21f)
            horizontalLineTo(13.315f)
            curveTo(12.558f, 19.994f, 12f, 18.678f, 12f, 17f)
            lineTo(12f, 13.5f)
            curveTo(12f, 13.322f, 12.03f, 13.154f, 12.084f, 13f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 13f, 6f, 12.664f, 6f, 12.25f)
            verticalLineTo(8.75f)
            curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 8f, 18f, 8.336f, 18f, 8.75f)
            close()
            moveTo(3.5f, 5f)
            curveTo(3.5f, 4.724f, 3.724f, 4.5f, 4f, 4.5f)
            horizontalLineTo(20f)
            curveTo(20.276f, 4.5f, 20.5f, 4.724f, 20.5f, 5f)
            curveTo(20.5f, 5.276f, 20.276f, 5.5f, 20f, 5.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 5.5f, 3.5f, 5.276f, 3.5f, 5f)
            close()
            moveTo(10f, 16.5f)
            verticalLineTo(21f)
            horizontalLineTo(7.5f)
            verticalLineTo(16.5f)
            horizontalLineTo(10f)
            close()
            moveTo(22.501f, 12.977f)
            curveTo(20.594f, 12.805f, 19.066f, 11.691f, 18.385f, 11.106f)
            curveTo(18.169f, 10.92f, 17.832f, 10.92f, 17.615f, 11.106f)
            curveTo(16.934f, 11.69f, 15.406f, 12.805f, 13.5f, 12.977f)
            curveTo(13.225f, 13.002f, 13f, 13.224f, 13f, 13.5f)
            lineTo(13f, 17f)
            curveTo(13f, 21.222f, 17.094f, 22.716f, 17.873f, 22.962f)
            curveTo(17.956f, 22.988f, 18.044f, 22.988f, 18.128f, 22.962f)
            curveTo(18.907f, 22.716f, 23f, 21.222f, 23f, 17f)
            lineTo(23f, 13.5f)
            curveTo(23f, 13.224f, 22.776f, 13.002f, 22.501f, 12.977f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingRetailShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BuildingRetailShield, contentDescription = null)
    }
}
