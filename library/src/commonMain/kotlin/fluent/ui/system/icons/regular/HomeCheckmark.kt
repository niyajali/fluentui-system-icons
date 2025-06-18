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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.HomeCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HomeCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.45f, 2.532f)
            curveTo(12.613f, 1.825f, 11.387f, 1.825f, 10.55f, 2.532f)
            lineTo(3.8f, 8.224f)
            curveTo(3.293f, 8.652f, 3f, 9.281f, 3f, 9.944f)
            verticalLineTo(19.254f)
            curveTo(3f, 20.22f, 3.783f, 21.004f, 4.75f, 21.004f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 21.004f, 21f, 20.22f, 21f, 19.254f)
            lineTo(21f, 9.944f)
            curveTo(21f, 9.281f, 20.707f, 8.652f, 20.201f, 8.224f)
            lineTo(13.45f, 2.532f)
            close()
            moveTo(11.517f, 3.679f)
            curveTo(11.796f, 3.443f, 12.204f, 3.443f, 12.483f, 3.679f)
            lineTo(19.233f, 9.371f)
            curveTo(19.403f, 9.513f, 19.5f, 9.723f, 19.5f, 9.944f)
            lineTo(19.5f, 19.254f)
            curveTo(19.5f, 19.392f, 19.388f, 19.504f, 19.25f, 19.504f)
            horizontalLineTo(4.75f)
            curveTo(4.612f, 19.504f, 4.5f, 19.392f, 4.5f, 19.254f)
            lineTo(4.5f, 9.944f)
            curveTo(4.5f, 9.723f, 4.598f, 9.513f, 4.767f, 9.371f)
            lineTo(11.517f, 3.679f)
            close()
            moveTo(15.784f, 11.28f)
            curveTo(16.077f, 10.987f, 16.077f, 10.513f, 15.784f, 10.22f)
            curveTo(15.491f, 9.927f, 15.016f, 9.927f, 14.723f, 10.22f)
            lineTo(10.75f, 14.193f)
            lineTo(9.28f, 12.723f)
            curveTo(8.987f, 12.43f, 8.513f, 12.43f, 8.22f, 12.723f)
            curveTo(7.927f, 13.016f, 7.927f, 13.491f, 8.22f, 13.784f)
            lineTo(10.22f, 15.784f)
            curveTo(10.36f, 15.924f, 10.551f, 16.003f, 10.75f, 16.003f)
            curveTo(10.949f, 16.003f, 11.14f, 15.924f, 11.28f, 15.784f)
            lineTo(15.784f, 11.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomeCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HomeCheckmark, contentDescription = null)
    }
}
