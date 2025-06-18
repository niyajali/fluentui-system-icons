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

public val FluentUi.Regular.PersonBoard: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonBoard",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.25f, 12.25f)
            curveTo(15.25f, 11.283f, 14.467f, 10.5f, 13.5f, 10.5f)
            horizontalLineTo(7.5f)
            curveTo(6.534f, 10.5f, 5.75f, 11.283f, 5.75f, 12.25f)
            verticalLineTo(12.75f)
            curveTo(5.75f, 13.829f, 6.265f, 14.405f, 7.126f, 14.95f)
            curveTo(7.975f, 15.488f, 9.153f, 15.75f, 10.5f, 15.75f)
            curveTo(12.089f, 15.75f, 13.275f, 15.491f, 14.069f, 14.945f)
            curveTo(14.882f, 14.386f, 15.25f, 13.801f, 15.25f, 12.75f)
            verticalLineTo(12.25f)
            close()
            moveTo(7.25f, 12.25f)
            curveTo(7.25f, 12.112f, 7.362f, 12f, 7.5f, 12f)
            horizontalLineTo(13.5f)
            curveTo(13.638f, 12f, 13.75f, 12.112f, 13.75f, 12.25f)
            verticalLineTo(12.75f)
            curveTo(13.75f, 13.016f, 13.715f, 13.079f, 13.648f, 13.2f)
            curveTo(13.631f, 13.231f, 13.612f, 13.265f, 13.591f, 13.307f)
            curveTo(13.487f, 13.514f, 13.327f, 13.685f, 13.088f, 13.823f)
            curveTo(12.595f, 14.107f, 11.779f, 14.25f, 10.5f, 14.25f)
            curveTo(9.481f, 14.25f, 8.654f, 14.11f, 8.09f, 13.817f)
            curveTo(7.811f, 13.672f, 7.604f, 13.494f, 7.465f, 13.282f)
            curveTo(7.433f, 13.233f, 7.404f, 13.195f, 7.379f, 13.162f)
            curveTo(7.296f, 13.052f, 7.25f, 12.992f, 7.25f, 12.75f)
            verticalLineTo(12.25f)
            close()
            moveTo(13f, 7.5f)
            curveTo(13f, 8.881f, 11.881f, 10f, 10.5f, 10f)
            curveTo(9.119f, 10f, 8f, 8.881f, 8f, 7.5f)
            curveTo(8f, 6.119f, 9.119f, 5f, 10.5f, 5f)
            curveTo(11.881f, 5f, 13f, 6.119f, 13f, 7.5f)
            close()
            moveTo(11.5f, 7.5f)
            curveTo(11.5f, 6.948f, 11.052f, 6.5f, 10.5f, 6.5f)
            curveTo(9.948f, 6.5f, 9.5f, 6.948f, 9.5f, 7.5f)
            curveTo(9.5f, 8.052f, 9.948f, 8.5f, 10.5f, 8.5f)
            curveTo(11.052f, 8.5f, 11.5f, 8.052f, 11.5f, 7.5f)
            close()
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(14.75f)
            curveTo(16.545f, 3f, 18f, 4.455f, 18f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(18f, 16.545f, 16.545f, 18f, 14.75f, 18f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 18f, 3f, 16.545f, 3f, 14.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.25f, 4.5f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(4.5f, 15.717f, 5.284f, 16.5f, 6.25f, 16.5f)
            horizontalLineTo(14.75f)
            curveTo(15.717f, 16.5f, 16.5f, 15.717f, 16.5f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(16.5f, 5.284f, 15.717f, 4.5f, 14.75f, 4.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(8.75f, 20.5f)
            curveTo(7.599f, 20.5f, 6.588f, 19.902f, 6.011f, 19f)
            horizontalLineTo(15.25f)
            curveTo(17.321f, 19f, 19f, 17.321f, 19f, 15.25f)
            verticalLineTo(6.011f)
            curveTo(19.902f, 6.588f, 20.5f, 7.599f, 20.5f, 8.75f)
            verticalLineTo(15.25f)
            curveTo(20.5f, 18.149f, 18.149f, 20.5f, 15.25f, 20.5f)
            horizontalLineTo(8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonBoardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonBoard, contentDescription = null)
    }
}
