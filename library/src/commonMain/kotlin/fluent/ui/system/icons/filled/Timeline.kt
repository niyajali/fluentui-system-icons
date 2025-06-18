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

public val FluentUi.Filled.Timeline: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Timeline",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.25f, 13f)
            curveTo(16.217f, 13f, 17f, 13.784f, 17f, 14.75f)
            verticalLineTo(19.254f)
            curveTo(17f, 20.22f, 16.217f, 21.004f, 15.25f, 21.004f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 21.004f, 2f, 20.22f, 2f, 19.254f)
            verticalLineTo(14.75f)
            curveTo(2f, 13.784f, 2.784f, 13f, 3.75f, 13f)
            horizontalLineTo(15.25f)
            close()
            moveTo(21.001f, 14.896f)
            lineTo(21f, 20.25f)
            curveTo(21f, 20.665f, 20.665f, 21f, 20.25f, 21f)
            curveTo(19.871f, 21f, 19.557f, 20.718f, 19.507f, 20.352f)
            lineTo(19.5f, 20.25f)
            lineTo(19.5f, 14.907f)
            curveTo(19.734f, 14.965f, 19.978f, 14.996f, 20.23f, 14.996f)
            curveTo(20.496f, 14.996f, 20.755f, 14.961f, 21.001f, 14.896f)
            close()
            moveTo(20.251f, 10.092f)
            curveTo(21.305f, 10.092f, 22.159f, 10.946f, 22.159f, 12f)
            curveTo(22.159f, 13.054f, 21.305f, 13.908f, 20.251f, 13.908f)
            curveTo(19.197f, 13.908f, 18.343f, 13.054f, 18.343f, 12f)
            curveTo(18.343f, 10.946f, 19.197f, 10.092f, 20.251f, 10.092f)
            close()
            moveTo(15.246f, 2.997f)
            curveTo(16.213f, 2.997f, 16.996f, 3.781f, 16.996f, 4.747f)
            verticalLineTo(9.25f)
            curveTo(16.996f, 10.217f, 16.213f, 11f, 15.246f, 11f)
            horizontalLineTo(3.746f)
            curveTo(2.78f, 11f, 1.996f, 10.217f, 1.996f, 9.25f)
            verticalLineTo(4.747f)
            curveTo(1.996f, 3.829f, 2.703f, 3.076f, 3.603f, 3.003f)
            lineTo(3.746f, 2.997f)
            horizontalLineTo(15.246f)
            close()
            moveTo(20.251f, 3f)
            curveTo(20.631f, 3f, 20.945f, 3.282f, 20.994f, 3.649f)
            lineTo(21.001f, 3.75f)
            lineTo(21.001f, 9.096f)
            curveTo(20.755f, 9.031f, 20.496f, 8.996f, 20.23f, 8.996f)
            curveTo(19.978f, 8.996f, 19.734f, 9.027f, 19.5f, 9.085f)
            lineTo(19.501f, 3.75f)
            curveTo(19.501f, 3.336f, 19.837f, 3f, 20.251f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TimelinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Timeline, contentDescription = null)
    }
}
