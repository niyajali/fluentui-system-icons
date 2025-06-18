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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PersonArrowBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonArrowBack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.314f, 15.499f)
            curveTo(11.486f, 14.966f, 11.726f, 14.462f, 12.022f, 13.999f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 13.999f, 2.004f, 15.006f, 2.004f, 16.248f)
            verticalLineTo(16.826f)
            curveTo(2.004f, 17.719f, 2.322f, 18.582f, 2.902f, 19.261f)
            curveTo(4.468f, 21.095f, 6.854f, 22f, 10f, 22f)
            curveTo(10.931f, 22f, 11.796f, 21.921f, 12.592f, 21.762f)
            curveTo(12.233f, 21.349f, 11.925f, 20.89f, 11.679f, 20.395f)
            curveTo(11.155f, 20.465f, 10.596f, 20.5f, 10f, 20.5f)
            curveTo(7.262f, 20.5f, 5.296f, 19.755f, 4.043f, 18.287f)
            curveTo(3.695f, 17.879f, 3.504f, 17.361f, 3.504f, 16.826f)
            verticalLineTo(16.248f)
            curveTo(3.504f, 15.835f, 3.839f, 15.499f, 4.253f, 15.499f)
            horizontalLineTo(11.314f)
            close()
            moveTo(10f, 2.004f)
            curveTo(12.762f, 2.004f, 15f, 4.242f, 15f, 7.004f)
            curveTo(15f, 9.765f, 12.762f, 12.004f, 10f, 12.004f)
            curveTo(7.239f, 12.004f, 5f, 9.765f, 5f, 7.004f)
            curveTo(5f, 4.242f, 7.239f, 2.004f, 10f, 2.004f)
            close()
            moveTo(10f, 3.504f)
            curveTo(8.067f, 3.504f, 6.5f, 5.071f, 6.5f, 7.004f)
            curveTo(6.5f, 8.937f, 8.067f, 10.504f, 10f, 10.504f)
            curveTo(11.933f, 10.504f, 13.5f, 8.937f, 13.5f, 7.004f)
            curveTo(13.5f, 5.071f, 11.933f, 3.504f, 10f, 3.504f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(16.354f, 15.354f)
            curveTo(16.549f, 15.158f, 16.549f, 14.842f, 16.354f, 14.646f)
            curveTo(16.158f, 14.451f, 15.842f, 14.451f, 15.646f, 14.646f)
            lineTo(14.146f, 16.146f)
            curveTo(13.951f, 16.342f, 13.951f, 16.658f, 14.146f, 16.854f)
            lineTo(15.646f, 18.354f)
            curveTo(15.842f, 18.549f, 16.158f, 18.549f, 16.354f, 18.354f)
            curveTo(16.549f, 18.158f, 16.549f, 17.842f, 16.354f, 17.646f)
            lineTo(15.707f, 17f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 17f, 20f, 18.007f, 20f, 19.25f)
            verticalLineTo(19.5f)
            curveTo(20f, 19.776f, 20.224f, 20f, 20.5f, 20f)
            curveTo(20.776f, 20f, 21f, 19.776f, 21f, 19.5f)
            verticalLineTo(19.25f)
            curveTo(21f, 17.455f, 19.545f, 16f, 17.75f, 16f)
            horizontalLineTo(15.707f)
            lineTo(16.354f, 15.354f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonArrowBack, contentDescription = null)
    }
}
