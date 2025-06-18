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

public val FluentUi.Filled.PanelLeftKey: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeftKey",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(11.199f)
            curveTo(11.281f, 19.844f, 11.386f, 19.7f, 11.513f, 19.573f)
            lineTo(12.586f, 18.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(5.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
            verticalLineTo(11.111f)
            curveTo(21.044f, 11.235f, 21.551f, 11.457f, 22f, 11.758f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(23f, 15.5f)
            curveTo(23f, 17.433f, 21.433f, 19f, 19.5f, 19f)
            horizontalLineTo(18f)
            verticalLineTo(20f)
            curveTo(18f, 20.276f, 17.776f, 20.5f, 17.5f, 20.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(21.5f)
            curveTo(16.5f, 21.776f, 16.276f, 22f, 16f, 22f)
            horizontalLineTo(15f)
            verticalLineTo(22.5f)
            curveTo(15f, 22.776f, 14.776f, 23f, 14.5f, 23f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 23f, 12f, 22.664f, 12f, 22.25f)
            verticalLineTo(20.811f)
            curveTo(12f, 20.612f, 12.079f, 20.421f, 12.22f, 20.28f)
            lineTo(15.97f, 16.53f)
            curveTo(16.016f, 16.484f, 16.067f, 16.445f, 16.12f, 16.414f)
            curveTo(16.042f, 16.122f, 16f, 15.816f, 16f, 15.5f)
            curveTo(16f, 13.567f, 17.567f, 12f, 19.5f, 12f)
            curveTo(21.433f, 12f, 23f, 13.567f, 23f, 15.5f)
            close()
            moveTo(20f, 16f)
            curveTo(20.552f, 16f, 21f, 15.552f, 21f, 15f)
            curveTo(21f, 14.448f, 20.552f, 14f, 20f, 14f)
            curveTo(19.448f, 14f, 19f, 14.448f, 19f, 15f)
            curveTo(19f, 15.552f, 19.448f, 16f, 20f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PanelLeftKeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PanelLeftKey, contentDescription = null)
    }
}
