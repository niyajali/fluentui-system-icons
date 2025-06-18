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

public val FluentIcons.Regular.LockClosed: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LockClosed",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 15.5f)
            curveTo(12.828f, 15.5f, 13.5f, 14.828f, 13.5f, 14f)
            curveTo(13.5f, 13.172f, 12.828f, 12.5f, 12f, 12.5f)
            curveTo(11.172f, 12.5f, 10.5f, 13.172f, 10.5f, 14f)
            curveTo(10.5f, 14.828f, 11.172f, 15.5f, 12f, 15.5f)
            close()
            moveTo(8f, 6f)
            curveTo(8f, 3.791f, 9.791f, 2f, 12f, 2f)
            curveTo(14.209f, 2f, 16f, 3.791f, 16f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 7f, 20f, 8.455f, 20f, 10.25f)
            verticalLineTo(17.75f)
            curveTo(20f, 19.545f, 18.545f, 21f, 16.75f, 21f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 21f, 4f, 19.545f, 4f, 17.75f)
            verticalLineTo(10.25f)
            curveTo(4f, 8.455f, 5.455f, 7f, 7.25f, 7f)
            horizontalLineTo(8f)
            verticalLineTo(6f)
            close()
            moveTo(12f, 3.5f)
            curveTo(10.619f, 3.5f, 9.5f, 4.619f, 9.5f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(14.5f)
            verticalLineTo(6f)
            curveTo(14.5f, 4.619f, 13.381f, 3.5f, 12f, 3.5f)
            close()
            moveTo(7.25f, 8.5f)
            curveTo(6.284f, 8.5f, 5.5f, 9.283f, 5.5f, 10.25f)
            verticalLineTo(17.75f)
            curveTo(5.5f, 18.716f, 6.284f, 19.5f, 7.25f, 19.5f)
            horizontalLineTo(16.75f)
            curveTo(17.716f, 19.5f, 18.5f, 18.716f, 18.5f, 17.75f)
            verticalLineTo(10.25f)
            curveTo(18.5f, 9.283f, 17.716f, 8.5f, 16.75f, 8.5f)
            horizontalLineTo(7.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LockClosedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LockClosed, contentDescription = null)
    }
}
