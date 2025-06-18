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

public val FluentUi.Filled.WrenchScrewdriver: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WrenchScrewdriver",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.079f, 2.415f)
            curveTo(16.206f, 2.161f, 16.466f, 2f, 16.75f, 2f)
            horizontalLineTo(18.25f)
            curveTo(18.534f, 2f, 18.794f, 2.161f, 18.921f, 2.415f)
            lineTo(19.921f, 4.415f)
            curveTo(20.033f, 4.639f, 20.026f, 4.904f, 19.901f, 5.122f)
            lineTo(19f, 6.699f)
            verticalLineTo(12f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 12f, 21f, 12.336f, 21f, 12.75f)
            verticalLineTo(14.5f)
            horizontalLineTo(14f)
            verticalLineTo(12.75f)
            curveTo(14f, 12.336f, 14.336f, 12f, 14.75f, 12f)
            horizontalLineTo(16f)
            verticalLineTo(6.699f)
            lineTo(15.099f, 5.122f)
            curveTo(14.974f, 4.904f, 14.967f, 4.639f, 15.079f, 4.415f)
            lineTo(16.079f, 2.415f)
            close()
            moveTo(14f, 16f)
            verticalLineTo(18.5f)
            curveTo(14f, 20.433f, 15.567f, 22f, 17.5f, 22f)
            curveTo(19.433f, 22f, 21f, 20.433f, 21f, 18.5f)
            verticalLineTo(16f)
            horizontalLineTo(14f)
            close()
            moveTo(8.828f, 2.212f)
            curveTo(9.034f, 2.073f, 9.295f, 2.044f, 9.526f, 2.136f)
            curveTo(11.56f, 2.942f, 13f, 4.927f, 13f, 7.25f)
            curveTo(13f, 9.374f, 11.796f, 11.215f, 10.036f, 12.132f)
            verticalLineTo(19.464f)
            curveTo(10.036f, 20.865f, 8.9f, 22f, 7.5f, 22f)
            curveTo(6.1f, 22f, 4.964f, 20.865f, 4.964f, 19.464f)
            verticalLineTo(12.132f)
            curveTo(3.204f, 11.215f, 2f, 9.374f, 2f, 7.25f)
            curveTo(2f, 4.927f, 3.44f, 2.942f, 5.473f, 2.136f)
            curveTo(5.704f, 2.044f, 5.966f, 2.073f, 6.171f, 2.212f)
            curveTo(6.377f, 2.352f, 6.5f, 2.584f, 6.5f, 2.833f)
            verticalLineTo(6.5f)
            curveTo(6.5f, 7.052f, 6.948f, 7.5f, 7.5f, 7.5f)
            curveTo(8.052f, 7.5f, 8.5f, 7.052f, 8.5f, 6.5f)
            verticalLineTo(2.833f)
            curveTo(8.5f, 2.584f, 8.623f, 2.352f, 8.828f, 2.212f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WrenchScrewdriverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WrenchScrewdriver, contentDescription = null)
    }
}
