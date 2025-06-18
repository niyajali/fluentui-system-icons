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

public val FluentUi.Filled.Production: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Production",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 5.25f)
            curveTo(4.5f, 4.284f, 5.284f, 3.5f, 6.25f, 3.5f)
            horizontalLineTo(8.75f)
            curveTo(9.717f, 3.5f, 10.5f, 4.284f, 10.5f, 5.25f)
            verticalLineTo(7.75f)
            curveTo(10.5f, 8.717f, 9.717f, 9.5f, 8.75f, 9.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 9.5f, 4.5f, 8.717f, 4.5f, 7.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(15.25f, 3.5f)
            curveTo(14.283f, 3.5f, 13.5f, 4.284f, 13.5f, 5.25f)
            verticalLineTo(7.75f)
            curveTo(13.5f, 8.717f, 14.283f, 9.5f, 15.25f, 9.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 9.5f, 19.5f, 8.717f, 19.5f, 7.75f)
            verticalLineTo(5.25f)
            curveTo(19.5f, 4.284f, 18.716f, 3.5f, 17.75f, 3.5f)
            horizontalLineTo(15.25f)
            close()
            moveTo(15f, 5.25f)
            curveTo(15f, 5.112f, 15.112f, 5f, 15.25f, 5f)
            horizontalLineTo(17.75f)
            curveTo(17.888f, 5f, 18f, 5.112f, 18f, 5.25f)
            verticalLineTo(7.75f)
            curveTo(18f, 7.888f, 17.888f, 8f, 17.75f, 8f)
            horizontalLineTo(15.25f)
            curveTo(15.112f, 8f, 15f, 7.888f, 15f, 7.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(2f, 16f)
            curveTo(2f, 13.515f, 4.015f, 11.5f, 6.5f, 11.5f)
            horizontalLineTo(17.5f)
            curveTo(19.985f, 11.5f, 22f, 13.515f, 22f, 16f)
            curveTo(22f, 18.485f, 19.985f, 20.5f, 17.5f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 20.5f, 2f, 18.485f, 2f, 16f)
            close()
            moveTo(8.5f, 16f)
            curveTo(8.5f, 15.172f, 7.828f, 14.5f, 7f, 14.5f)
            curveTo(6.172f, 14.5f, 5.5f, 15.172f, 5.5f, 16f)
            curveTo(5.5f, 16.828f, 6.172f, 17.5f, 7f, 17.5f)
            curveTo(7.828f, 17.5f, 8.5f, 16.828f, 8.5f, 16f)
            close()
            moveTo(13.5f, 16f)
            curveTo(13.5f, 15.172f, 12.828f, 14.5f, 12f, 14.5f)
            curveTo(11.172f, 14.5f, 10.5f, 15.172f, 10.5f, 16f)
            curveTo(10.5f, 16.828f, 11.172f, 17.5f, 12f, 17.5f)
            curveTo(12.828f, 17.5f, 13.5f, 16.828f, 13.5f, 16f)
            close()
            moveTo(17f, 17.5f)
            curveTo(17.828f, 17.5f, 18.5f, 16.828f, 18.5f, 16f)
            curveTo(18.5f, 15.172f, 17.828f, 14.5f, 17f, 14.5f)
            curveTo(16.172f, 14.5f, 15.5f, 15.172f, 15.5f, 16f)
            curveTo(15.5f, 16.828f, 16.172f, 17.5f, 17f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ProductionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Production, contentDescription = null)
    }
}
