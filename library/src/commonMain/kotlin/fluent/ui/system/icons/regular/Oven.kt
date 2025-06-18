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

public val FluentIcons.Regular.Oven: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Oven",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(19.5f, 6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            close()
            moveTo(19.5f, 17.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            close()
            moveTo(8f, 7.25f)
            curveTo(8.552f, 7.25f, 9f, 6.802f, 9f, 6.25f)
            curveTo(9f, 5.698f, 8.552f, 5.25f, 8f, 5.25f)
            curveTo(7.448f, 5.25f, 7f, 5.698f, 7f, 6.25f)
            curveTo(7f, 6.802f, 7.448f, 7.25f, 8f, 7.25f)
            close()
            moveTo(13f, 6.25f)
            curveTo(13f, 6.802f, 12.552f, 7.25f, 12f, 7.25f)
            curveTo(11.448f, 7.25f, 11f, 6.802f, 11f, 6.25f)
            curveTo(11f, 5.698f, 11.448f, 5.25f, 12f, 5.25f)
            curveTo(12.552f, 5.25f, 13f, 5.698f, 13f, 6.25f)
            close()
            moveTo(16f, 7.25f)
            curveTo(16.552f, 7.25f, 17f, 6.802f, 17f, 6.25f)
            curveTo(17f, 5.698f, 16.552f, 5.25f, 16f, 5.25f)
            curveTo(15.448f, 5.25f, 15f, 5.698f, 15f, 6.25f)
            curveTo(15f, 6.802f, 15.448f, 7.25f, 16f, 7.25f)
            close()
            moveTo(7.5f, 16.5f)
            verticalLineTo(12.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(16.5f)
            horizontalLineTo(7.5f)
            close()
            moveTo(7.25f, 11f)
            curveTo(6.56f, 11f, 6f, 11.56f, 6f, 12.25f)
            verticalLineTo(16.75f)
            curveTo(6f, 17.44f, 6.56f, 18f, 7.25f, 18f)
            horizontalLineTo(16.75f)
            curveTo(17.44f, 18f, 18f, 17.44f, 18f, 16.75f)
            verticalLineTo(12.25f)
            curveTo(18f, 11.56f, 17.44f, 11f, 16.75f, 11f)
            horizontalLineTo(7.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OvenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Oven, contentDescription = null)
    }
}
