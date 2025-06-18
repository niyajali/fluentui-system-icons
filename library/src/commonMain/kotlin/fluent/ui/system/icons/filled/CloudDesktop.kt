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

public val FluentUi.Filled.CloudDesktop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudDesktop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 13f)
            curveTo(22.552f, 13f, 23f, 13.448f, 23f, 14f)
            verticalLineTo(19f)
            curveTo(23f, 19.552f, 22.552f, 20f, 22f, 20f)
            horizontalLineTo(19f)
            verticalLineTo(21.5f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 21.5f, 20f, 21.836f, 20f, 22.25f)
            curveTo(20f, 22.275f, 19.999f, 22.3f, 19.996f, 22.324f)
            curveTo(19.999f, 22.341f, 20f, 22.358f, 20f, 22.375f)
            curveTo(20f, 22.651f, 19.651f, 23f, 19.375f, 23f)
            horizontalLineTo(15.625f)
            curveTo(15.349f, 23f, 15f, 22.651f, 15f, 22.375f)
            curveTo(15f, 22.358f, 15.002f, 22.341f, 15.004f, 22.324f)
            curveTo(15.002f, 22.3f, 15f, 22.275f, 15f, 22.25f)
            curveTo(15f, 21.836f, 15.336f, 21.5f, 15.75f, 21.5f)
            horizontalLineTo(16f)
            verticalLineTo(20f)
            horizontalLineTo(13f)
            curveTo(12.448f, 20f, 12f, 19.552f, 12f, 19f)
            verticalLineTo(14f)
            curveTo(12f, 13.448f, 12.448f, 13f, 13f, 13f)
            horizontalLineTo(22f)
            close()
            moveTo(12f, 4f)
            curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.02f)
            curveTo(19.695f, 9.184f, 21.171f, 10.379f, 21.744f, 12f)
            horizontalLineTo(13f)
            curveTo(11.895f, 12f, 11f, 12.895f, 11f, 14f)
            verticalLineTo(18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.02f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CloudDesktop, contentDescription = null)
    }
}
