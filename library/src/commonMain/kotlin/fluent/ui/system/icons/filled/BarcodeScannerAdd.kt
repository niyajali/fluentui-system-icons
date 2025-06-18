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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.BarcodeScannerAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BarcodeScannerAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 11f)
            curveTo(20.538f, 11f, 23f, 13.462f, 23f, 16.5f)
            curveTo(23f, 19.538f, 20.538f, 22f, 17.5f, 22f)
            curveTo(14.462f, 22f, 12f, 19.538f, 12f, 16.5f)
            curveTo(12f, 13.462f, 14.462f, 11f, 17.5f, 11f)
            close()
            moveTo(3f, 15.5f)
            curveTo(3.552f, 15.5f, 4f, 15.948f, 4f, 16.5f)
            verticalLineTo(18f)
            curveTo(4f, 18.552f, 4.448f, 19f, 5f, 19f)
            horizontalLineTo(6.5f)
            curveTo(7.052f, 19f, 7.5f, 19.448f, 7.5f, 20f)
            curveTo(7.5f, 20.552f, 7.052f, 21f, 6.5f, 21f)
            horizontalLineTo(5f)
            curveTo(3.343f, 21f, 2f, 19.657f, 2f, 18f)
            verticalLineTo(16.5f)
            curveTo(2f, 15.948f, 2.448f, 15.5f, 3f, 15.5f)
            close()
            moveTo(17.5f, 12.999f)
            curveTo(17.224f, 12.999f, 17f, 13.223f, 17f, 13.499f)
            verticalLineTo(16f)
            horizontalLineTo(14.495f)
            curveTo(14.219f, 16f, 13.996f, 16.224f, 13.996f, 16.5f)
            curveTo(13.996f, 16.776f, 14.219f, 17f, 14.495f, 17f)
            horizontalLineTo(17.001f)
            verticalLineTo(19.504f)
            curveTo(17.001f, 19.78f, 17.225f, 20.004f, 17.501f, 20.004f)
            curveTo(17.777f, 20.004f, 18.001f, 19.78f, 18.001f, 19.504f)
            verticalLineTo(17f)
            horizontalLineTo(20.497f)
            curveTo(20.773f, 17f, 20.996f, 16.776f, 20.996f, 16.5f)
            curveTo(20.996f, 16.224f, 20.773f, 16f, 20.497f, 16f)
            horizontalLineTo(18f)
            verticalLineTo(13.499f)
            curveTo(18f, 13.223f, 17.776f, 12.999f, 17.5f, 12.999f)
            close()
            moveTo(6f, 6.75f)
            curveTo(6.552f, 6.75f, 7f, 7.198f, 7f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(7f, 16.802f, 6.552f, 17.25f, 6f, 17.25f)
            curveTo(5.448f, 17.25f, 5f, 16.802f, 5f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(5f, 7.198f, 5.448f, 6.75f, 6f, 6.75f)
            close()
            moveTo(10f, 6.75f)
            curveTo(10.552f, 6.75f, 11f, 7.198f, 11f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(11f, 16.802f, 10.552f, 17.25f, 10f, 17.25f)
            curveTo(9.448f, 17.25f, 9f, 16.802f, 9f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(9f, 7.198f, 9.448f, 6.75f, 10f, 6.75f)
            close()
            moveTo(14f, 6.75f)
            curveTo(14.552f, 6.75f, 15f, 7.198f, 15f, 7.75f)
            verticalLineTo(10.498f)
            curveTo(14.252f, 10.81f, 13.576f, 11.259f, 13f, 11.811f)
            verticalLineTo(7.75f)
            curveTo(13f, 7.198f, 13.448f, 6.75f, 14f, 6.75f)
            close()
            moveTo(18f, 6.75f)
            curveTo(18.552f, 6.75f, 19f, 7.198f, 19f, 7.75f)
            verticalLineTo(10.176f)
            curveTo(18.518f, 10.062f, 18.016f, 10f, 17.5f, 10f)
            curveTo(17.332f, 10f, 17.165f, 10.008f, 17f, 10.021f)
            verticalLineTo(7.75f)
            curveTo(17f, 7.198f, 17.448f, 6.75f, 18f, 6.75f)
            close()
            moveTo(6.5f, 3f)
            curveTo(7.052f, 3f, 7.5f, 3.448f, 7.5f, 4f)
            curveTo(7.5f, 4.552f, 7.052f, 5f, 6.5f, 5f)
            horizontalLineTo(5f)
            curveTo(4.448f, 5f, 4f, 5.448f, 4f, 6f)
            verticalLineTo(7.5f)
            curveTo(4f, 8.052f, 3.552f, 8.5f, 3f, 8.5f)
            curveTo(2.448f, 8.5f, 2f, 8.052f, 2f, 7.5f)
            verticalLineTo(6f)
            curveTo(2f, 4.343f, 3.343f, 3f, 5f, 3f)
            horizontalLineTo(6.5f)
            close()
            moveTo(19f, 3f)
            curveTo(20.657f, 3f, 22f, 4.343f, 22f, 6f)
            verticalLineTo(7.5f)
            curveTo(22f, 8.052f, 21.552f, 8.5f, 21f, 8.5f)
            curveTo(20.448f, 8.5f, 20f, 8.052f, 20f, 7.5f)
            verticalLineTo(6f)
            curveTo(20f, 5.448f, 19.552f, 5f, 19f, 5f)
            horizontalLineTo(17.5f)
            curveTo(16.948f, 5f, 16.5f, 4.552f, 16.5f, 4f)
            curveTo(16.5f, 3.448f, 16.948f, 3f, 17.5f, 3f)
            horizontalLineTo(19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BarcodeScannerAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BarcodeScannerAdd, contentDescription = null)
    }
}
