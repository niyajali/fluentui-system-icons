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

public val FluentUi.Filled.PositionToFront: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PositionToFront",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(1f, 3.75f)
            curveTo(1f, 2.231f, 2.231f, 1f, 3.75f, 1f)
            horizontalLineTo(7.25f)
            curveTo(8.769f, 1f, 10f, 2.231f, 10f, 3.75f)
            verticalLineTo(5f)
            horizontalLineTo(9.25f)
            curveTo(8.994f, 5f, 8.743f, 5.023f, 8.5f, 5.066f)
            verticalLineTo(3.75f)
            curveTo(8.5f, 3.06f, 7.94f, 2.5f, 7.25f, 2.5f)
            horizontalLineTo(3.75f)
            curveTo(3.06f, 2.5f, 2.5f, 3.06f, 2.5f, 3.75f)
            verticalLineTo(7.25f)
            curveTo(2.5f, 7.94f, 3.06f, 8.5f, 3.75f, 8.5f)
            horizontalLineTo(5.066f)
            curveTo(5.023f, 8.743f, 5f, 8.994f, 5f, 9.25f)
            verticalLineTo(10f)
            horizontalLineTo(3.75f)
            curveTo(2.231f, 10f, 1f, 8.769f, 1f, 7.25f)
            verticalLineTo(3.75f)
            close()
            moveTo(14f, 19f)
            verticalLineTo(20.25f)
            curveTo(14f, 21.769f, 15.231f, 23f, 16.75f, 23f)
            horizontalLineTo(20.25f)
            curveTo(21.769f, 23f, 23f, 21.769f, 23f, 20.25f)
            verticalLineTo(16.75f)
            curveTo(23f, 15.231f, 21.769f, 14f, 20.25f, 14f)
            horizontalLineTo(19f)
            verticalLineTo(14.75f)
            curveTo(19f, 15.006f, 18.977f, 15.257f, 18.934f, 15.5f)
            horizontalLineTo(20.25f)
            curveTo(20.94f, 15.5f, 21.5f, 16.06f, 21.5f, 16.75f)
            verticalLineTo(20.25f)
            curveTo(21.5f, 20.94f, 20.94f, 21.5f, 20.25f, 21.5f)
            horizontalLineTo(16.75f)
            curveTo(16.06f, 21.5f, 15.5f, 20.94f, 15.5f, 20.25f)
            verticalLineTo(18.934f)
            curveTo(15.257f, 18.977f, 15.006f, 19f, 14.75f, 19f)
            horizontalLineTo(14f)
            close()
            moveTo(6f, 9.25f)
            curveTo(6f, 7.455f, 7.455f, 6f, 9.25f, 6f)
            horizontalLineTo(14.75f)
            curveTo(16.545f, 6f, 18f, 7.455f, 18f, 9.25f)
            verticalLineTo(14.75f)
            curveTo(18f, 16.545f, 16.545f, 18f, 14.75f, 18f)
            horizontalLineTo(9.25f)
            curveTo(7.455f, 18f, 6f, 16.545f, 6f, 14.75f)
            verticalLineTo(9.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PositionToFrontPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PositionToFront, contentDescription = null)
    }
}
