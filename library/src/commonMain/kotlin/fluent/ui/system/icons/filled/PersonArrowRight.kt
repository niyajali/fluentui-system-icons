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

public val FluentUi.Filled.PersonArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 17.5f)
            curveTo(11f, 16.212f, 11.375f, 15.01f, 12.022f, 14f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
            verticalLineTo(17.169f)
            curveTo(2.004f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
            curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
            curveTo(10.932f, 22.001f, 11.796f, 21.922f, 12.593f, 21.763f)
            curveTo(11.601f, 20.622f, 11f, 19.131f, 11f, 17.5f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
            close()
            moveTo(18.354f, 14.647f)
            curveTo(18.159f, 14.451f, 17.842f, 14.451f, 17.647f, 14.647f)
            curveTo(17.452f, 14.842f, 17.452f, 15.159f, 17.647f, 15.354f)
            lineTo(19.293f, 17f)
            horizontalLineTo(15f)
            curveTo(14.724f, 17f, 14.5f, 17.224f, 14.5f, 17.5f)
            curveTo(14.5f, 17.776f, 14.724f, 18f, 15f, 18f)
            horizontalLineTo(19.293f)
            lineTo(17.647f, 19.647f)
            curveTo(17.452f, 19.842f, 17.452f, 20.159f, 17.647f, 20.354f)
            curveTo(17.842f, 20.549f, 18.159f, 20.549f, 18.354f, 20.354f)
            lineTo(20.854f, 17.854f)
            curveTo(20.907f, 17.801f, 20.946f, 17.739f, 20.97f, 17.672f)
            curveTo(20.989f, 17.621f, 20.999f, 17.567f, 21f, 17.51f)
            lineTo(21f, 17.5f)
            curveTo(21f, 17.423f, 20.983f, 17.35f, 20.952f, 17.285f)
            curveTo(20.936f, 17.253f, 20.917f, 17.222f, 20.895f, 17.193f)
            curveTo(20.881f, 17.175f, 20.866f, 17.158f, 20.85f, 17.143f)
            lineTo(18.354f, 14.647f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonArrowRight, contentDescription = null)
    }
}
