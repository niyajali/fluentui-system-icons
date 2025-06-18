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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.Glasses: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Glasses",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.909f, 5f)
            horizontalLineTo(8.75f)
            curveTo(9.164f, 5f, 9.5f, 5.336f, 9.5f, 5.75f)
            curveTo(9.5f, 6.13f, 9.218f, 6.443f, 8.852f, 6.493f)
            lineTo(8.75f, 6.5f)
            horizontalLineTo(7.909f)
            curveTo(7.734f, 6.5f, 7.566f, 6.561f, 7.432f, 6.671f)
            lineTo(7.357f, 6.743f)
            lineTo(5.283f, 8.999f)
            lineTo(8.749f, 9f)
            curveTo(9.908f, 9f, 10.863f, 9.877f, 10.986f, 11.004f)
            horizontalLineTo(13.013f)
            curveTo(13.136f, 9.877f, 14.09f, 9f, 15.25f, 9f)
            lineTo(18.727f, 8.999f)
            lineTo(16.644f, 6.741f)
            curveTo(16.525f, 6.613f, 16.367f, 6.531f, 16.196f, 6.507f)
            lineTo(16.093f, 6.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 6.5f, 14.5f, 6.164f, 14.5f, 5.75f)
            curveTo(14.5f, 5.37f, 14.782f, 5.057f, 15.148f, 5.007f)
            lineTo(15.25f, 5f)
            horizontalLineTo(16.093f)
            curveTo(16.658f, 5f, 17.2f, 5.213f, 17.613f, 5.592f)
            lineTo(17.746f, 5.724f)
            lineTo(21.388f, 9.671f)
            curveTo(21.438f, 9.726f, 21.479f, 9.786f, 21.51f, 9.849f)
            curveTo(21.816f, 10.233f, 21.999f, 10.72f, 21.999f, 11.25f)
            verticalLineTo(14.746f)
            curveTo(21.999f, 16.541f, 20.544f, 17.996f, 18.749f, 17.996f)
            horizontalLineTo(16.25f)
            curveTo(14.455f, 17.996f, 13f, 16.541f, 13f, 14.746f)
            lineTo(12.999f, 12.504f)
            horizontalLineTo(10.998f)
            lineTo(10.999f, 14.746f)
            curveTo(10.999f, 16.541f, 9.544f, 17.996f, 7.749f, 17.996f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 17.996f, 2f, 16.541f, 2f, 14.746f)
            verticalLineTo(11.25f)
            curveTo(2f, 10.688f, 2.206f, 10.174f, 2.546f, 9.78f)
            lineTo(2.584f, 9.725f)
            lineTo(2.628f, 9.673f)
            lineTo(6.252f, 5.728f)
            curveTo(6.635f, 5.31f, 7.161f, 5.055f, 7.721f, 5.008f)
            lineTo(7.909f, 5f)
            horizontalLineTo(8.75f)
            horizontalLineTo(7.909f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GlassesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Glasses, contentDescription = null)
    }
}
