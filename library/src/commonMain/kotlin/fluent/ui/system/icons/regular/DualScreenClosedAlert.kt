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

public val FluentIcons.Regular.DualScreenClosedAlert: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenClosedAlert",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.499f, 2f)
            lineTo(16.501f, 2f)
            curveTo(17.561f, 2.003f, 18.576f, 2.425f, 19.326f, 3.174f)
            curveTo(20.075f, 3.924f, 20.497f, 4.939f, 20.5f, 5.999f)
            lineTo(20.5f, 6f)
            lineTo(20.5f, 8.519f)
            lineTo(21.884f, 10.18f)
            curveTo(22.008f, 10.329f, 22.035f, 10.536f, 21.953f, 10.712f)
            curveTo(21.871f, 10.888f, 21.694f, 11f, 21.5f, 11f)
            horizontalLineTo(11.5f)
            curveTo(11.306f, 11f, 11.13f, 10.888f, 11.047f, 10.712f)
            curveTo(10.965f, 10.536f, 10.992f, 10.329f, 11.116f, 10.18f)
            lineTo(12.5f, 8.519f)
            verticalLineTo(5.999f)
            curveTo(12.503f, 4.939f, 12.925f, 3.924f, 13.675f, 3.174f)
            curveTo(14.424f, 2.425f, 15.439f, 2.003f, 16.499f, 2f)
            close()
            moveTo(5.75f, 5f)
            horizontalLineTo(11.603f)
            curveTo(11.536f, 5.325f, 11.501f, 5.659f, 11.5f, 5.996f)
            verticalLineTo(6.5f)
            horizontalLineTo(6.5f)
            verticalLineTo(19.5f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 19.5f, 15.5f, 19.164f, 15.5f, 18.75f)
            verticalLineTo(13.829f)
            curveTo(15.813f, 13.94f, 16.149f, 14f, 16.5f, 14f)
            curveTo(16.67f, 14f, 16.837f, 13.986f, 17f, 13.958f)
            verticalLineTo(18.75f)
            curveTo(17f, 19.993f, 15.993f, 21f, 14.75f, 21f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 21f, 5f, 20.664f, 5f, 20.25f)
            verticalLineTo(5.75f)
            curveTo(5f, 5.336f, 5.336f, 5f, 5.75f, 5f)
            close()
            moveTo(15.504f, 12.732f)
            curveTo(15.201f, 12.556f, 14.951f, 12.304f, 14.777f, 12f)
            horizontalLineTo(18.223f)
            curveTo(18.049f, 12.304f, 17.799f, 12.556f, 17.496f, 12.732f)
            curveTo(17.193f, 12.908f, 16.85f, 13f, 16.5f, 13f)
            curveTo(16.15f, 13f, 15.807f, 12.908f, 15.504f, 12.732f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenClosedAlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DualScreenClosedAlert, contentDescription = null)
    }
}
