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

public val FluentUi.Regular.MyLocation: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MyLocation",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(12.38f, 2f, 12.693f, 2.282f, 12.743f, 2.648f)
            lineTo(12.75f, 2.75f)
            lineTo(12.749f, 4.538f)
            curveTo(16.293f, 4.888f, 19.112f, 7.707f, 19.463f, 11.252f)
            lineTo(19.5f, 11.25f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 11.25f, 22f, 11.586f, 22f, 12f)
            curveTo(22f, 12.38f, 21.718f, 12.693f, 21.352f, 12.743f)
            lineTo(21.25f, 12.75f)
            lineTo(19.462f, 12.749f)
            curveTo(19.112f, 16.293f, 16.293f, 19.112f, 12.748f, 19.463f)
            lineTo(12.75f, 19.5f)
            verticalLineTo(21.25f)
            curveTo(12.75f, 21.664f, 12.414f, 22f, 12f, 22f)
            curveTo(11.62f, 22f, 11.307f, 21.718f, 11.257f, 21.352f)
            lineTo(11.25f, 21.25f)
            lineTo(11.251f, 19.462f)
            curveTo(7.707f, 19.112f, 4.888f, 16.293f, 4.537f, 12.748f)
            lineTo(4.5f, 12.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 12.75f, 2f, 12.414f, 2f, 12f)
            curveTo(2f, 11.62f, 2.282f, 11.307f, 2.648f, 11.257f)
            lineTo(2.75f, 11.25f)
            lineTo(4.538f, 11.251f)
            curveTo(4.888f, 7.707f, 7.707f, 4.888f, 11.252f, 4.537f)
            lineTo(11.25f, 4.5f)
            verticalLineTo(2.75f)
            curveTo(11.25f, 2.336f, 11.586f, 2f, 12f, 2f)
            close()
            moveTo(12f, 6f)
            curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
            curveTo(6f, 15.314f, 8.686f, 18f, 12f, 18f)
            curveTo(15.314f, 18f, 18f, 15.314f, 18f, 12f)
            curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
            close()
            moveTo(12f, 8f)
            curveTo(14.209f, 8f, 16f, 9.791f, 16f, 12f)
            curveTo(16f, 14.209f, 14.209f, 16f, 12f, 16f)
            curveTo(9.791f, 16f, 8f, 14.209f, 8f, 12f)
            curveTo(8f, 9.791f, 9.791f, 8f, 12f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MyLocationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MyLocation, contentDescription = null)
    }
}
