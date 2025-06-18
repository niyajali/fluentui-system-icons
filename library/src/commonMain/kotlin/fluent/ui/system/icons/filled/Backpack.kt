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

public val FluentUi.Filled.Backpack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Backpack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(10.039f, 2f, 8.429f, 3.506f, 8.264f, 5.424f)
            curveTo(5.728f, 6.766f, 4f, 9.431f, 4f, 12.5f)
            verticalLineTo(14f)
            horizontalLineTo(20f)
            verticalLineTo(12.5f)
            curveTo(20f, 9.431f, 18.272f, 6.766f, 15.736f, 5.424f)
            curveTo(15.571f, 3.506f, 13.961f, 2f, 12f, 2f)
            close()
            moveTo(20f, 15.714f)
            horizontalLineTo(9.5f)
            verticalLineTo(17.25f)
            curveTo(9.5f, 17.664f, 9.164f, 18f, 8.75f, 18f)
            curveTo(8.336f, 18f, 8f, 17.664f, 8f, 17.25f)
            verticalLineTo(15.714f)
            horizontalLineTo(4f)
            verticalLineTo(18.75f)
            curveTo(4f, 20.545f, 5.455f, 22f, 7.25f, 22f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 22f, 20f, 20.545f, 20f, 18.75f)
            verticalLineTo(15.714f)
            close()
            moveTo(12f, 4.5f)
            curveTo(11.302f, 4.5f, 10.625f, 4.589f, 9.98f, 4.757f)
            curveTo(10.347f, 4.012f, 11.114f, 3.5f, 12f, 3.5f)
            curveTo(12.886f, 3.5f, 13.653f, 4.012f, 14.02f, 4.757f)
            curveTo(13.375f, 4.589f, 12.698f, 4.5f, 12f, 4.5f)
            close()
            moveTo(8f, 10.417f)
            curveTo(8f, 9.082f, 9.082f, 8f, 10.417f, 8f)
            horizontalLineTo(13.583f)
            curveTo(14.918f, 8f, 16f, 9.082f, 16f, 10.417f)
            curveTo(16f, 11.291f, 15.291f, 12f, 14.417f, 12f)
            horizontalLineTo(9.583f)
            curveTo(8.709f, 12f, 8f, 11.291f, 8f, 10.417f)
            close()
            moveTo(10.417f, 9.5f)
            curveTo(9.91f, 9.5f, 9.5f, 9.91f, 9.5f, 10.417f)
            curveTo(9.5f, 10.463f, 9.537f, 10.5f, 9.583f, 10.5f)
            horizontalLineTo(14.417f)
            curveTo(14.463f, 10.5f, 14.5f, 10.463f, 14.5f, 10.417f)
            curveTo(14.5f, 9.91f, 14.09f, 9.5f, 13.583f, 9.5f)
            horizontalLineTo(10.417f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BackpackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Backpack, contentDescription = null)
    }
}
