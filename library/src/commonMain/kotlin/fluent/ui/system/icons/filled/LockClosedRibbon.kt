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

public val FluentUi.Filled.LockClosedRibbon: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockClosedRibbon",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 7f)
            verticalLineTo(6f)
            curveTo(16f, 3.791f, 14.209f, 2f, 12f, 2f)
            curveTo(9.791f, 2f, 8f, 3.791f, 8f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 7f, 4f, 8.455f, 4f, 10.25f)
            verticalLineTo(17.75f)
            curveTo(4f, 19.545f, 5.455f, 21f, 7.25f, 21f)
            horizontalLineTo(16f)
            verticalLineTo(18.333f)
            curveTo(15.375f, 17.56f, 15f, 16.576f, 15f, 15.504f)
            curveTo(15f, 13.019f, 17.014f, 11.003f, 19.5f, 11.003f)
            curveTo(19.669f, 11.003f, 19.836f, 11.012f, 20f, 11.03f)
            verticalLineTo(10.25f)
            curveTo(20f, 8.455f, 18.545f, 7f, 16.75f, 7f)
            horizontalLineTo(16f)
            close()
            moveTo(9.5f, 7f)
            verticalLineTo(6f)
            curveTo(9.5f, 4.619f, 10.619f, 3.5f, 12f, 3.5f)
            curveTo(13.381f, 3.5f, 14.5f, 4.619f, 14.5f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            close()
            moveTo(13.5f, 14f)
            curveTo(13.5f, 14.828f, 12.828f, 15.5f, 12f, 15.5f)
            curveTo(11.172f, 15.5f, 10.5f, 14.828f, 10.5f, 14f)
            curveTo(10.5f, 13.172f, 11.172f, 12.5f, 12f, 12.5f)
            curveTo(12.828f, 12.5f, 13.5f, 13.172f, 13.5f, 14f)
            close()
            moveTo(19.5f, 19f)
            curveTo(20.479f, 19f, 21.365f, 18.598f, 22f, 17.949f)
            curveTo(22.619f, 17.318f, 23f, 16.454f, 23f, 15.5f)
            curveTo(23f, 13.567f, 21.433f, 12f, 19.5f, 12f)
            curveTo(17.567f, 12f, 16f, 13.567f, 16f, 15.5f)
            curveTo(16f, 16.346f, 16.3f, 17.121f, 16.799f, 17.726f)
            curveTo(16.863f, 17.804f, 16.93f, 17.878f, 17f, 17.949f)
            curveTo(17.635f, 18.598f, 18.521f, 19f, 19.5f, 19f)
            close()
            moveTo(17f, 22.3f)
            verticalLineTo(19.242f)
            curveTo(17.715f, 19.721f, 18.575f, 20f, 19.5f, 20f)
            curveTo(20.425f, 20f, 21.285f, 19.721f, 22f, 19.242f)
            verticalLineTo(22.3f)
            curveTo(22f, 22.924f, 21.246f, 23.236f, 20.805f, 22.795f)
            lineTo(19.5f, 21.49f)
            lineTo(18.195f, 22.795f)
            curveTo(17.754f, 23.236f, 17f, 22.924f, 17f, 22.3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LockClosedRibbonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LockClosedRibbon, contentDescription = null)
    }
}
