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

public val FluentUi.Regular.PersonAccounts: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonAccounts",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 14.05f)
            verticalLineTo(14f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
            verticalLineTo(16.827f)
            curveTo(2.004f, 17.719f, 2.322f, 18.583f, 2.902f, 19.262f)
            curveTo(4.468f, 21.096f, 6.854f, 22.001f, 10f, 22.001f)
            curveTo(10.358f, 22.001f, 10.705f, 21.99f, 11.043f, 21.966f)
            curveTo(11.015f, 21.815f, 11f, 21.66f, 11f, 21.5f)
            verticalLineTo(20.466f)
            curveTo(10.679f, 20.49f, 10.346f, 20.501f, 10f, 20.501f)
            curveTo(7.262f, 20.501f, 5.296f, 19.756f, 4.043f, 18.288f)
            curveTo(3.695f, 17.881f, 3.504f, 17.362f, 3.504f, 16.827f)
            verticalLineTo(16.249f)
            curveTo(3.504f, 15.835f, 3.839f, 15.5f, 4.253f, 15.5f)
            horizontalLineTo(11.208f)
            curveTo(11.529f, 14.765f, 12.194f, 14.214f, 13f, 14.05f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
            close()
            moveTo(10f, 3.505f)
            curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
            curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
            curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
            curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
            close()
            moveTo(14f, 15f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 15f, 12f, 15.672f, 12f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.329f, 12.672f, 23f, 13.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.329f, 23f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(23f, 15.672f, 22.328f, 15f, 21.5f, 15f)
            horizontalLineTo(21f)
            verticalLineTo(13.75f)
            curveTo(21f, 12.784f, 20.216f, 12f, 19.25f, 12f)
            horizontalLineTo(15.75f)
            curveTo(14.783f, 12f, 14f, 12.784f, 14f, 13.75f)
            verticalLineTo(15f)
            close()
            moveTo(15.5f, 13.75f)
            curveTo(15.5f, 13.612f, 15.612f, 13.5f, 15.75f, 13.5f)
            horizontalLineTo(19.25f)
            curveTo(19.388f, 13.5f, 19.5f, 13.612f, 19.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(15.5f)
            verticalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonAccountsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonAccounts, contentDescription = null)
    }
}
