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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.LockOpen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockOpen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 5f)
            curveTo(16f, 3.619f, 17.119f, 2.5f, 18.5f, 2.5f)
            curveTo(19.881f, 2.5f, 21f, 3.619f, 21f, 5f)
            verticalLineTo(5.25f)
            curveTo(21f, 5.664f, 21.336f, 6f, 21.75f, 6f)
            curveTo(22.164f, 6f, 22.5f, 5.664f, 22.5f, 5.25f)
            verticalLineTo(5f)
            curveTo(22.5f, 2.791f, 20.709f, 1f, 18.5f, 1f)
            curveTo(16.291f, 1f, 14.5f, 2.791f, 14.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 7f, 4f, 8.455f, 4f, 10.25f)
            verticalLineTo(17.75f)
            curveTo(4f, 19.545f, 5.455f, 21f, 7.25f, 21f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 21f, 20f, 19.545f, 20f, 17.75f)
            verticalLineTo(10.25f)
            curveTo(20f, 8.455f, 18.545f, 7f, 16.75f, 7f)
            horizontalLineTo(16f)
            verticalLineTo(5f)
            close()
            moveTo(12f, 15.5f)
            curveTo(11.172f, 15.5f, 10.5f, 14.828f, 10.5f, 14f)
            curveTo(10.5f, 13.172f, 11.172f, 12.5f, 12f, 12.5f)
            curveTo(12.828f, 12.5f, 13.5f, 13.172f, 13.5f, 14f)
            curveTo(13.5f, 14.828f, 12.828f, 15.5f, 12f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LockOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LockOpen, contentDescription = null)
    }
}
