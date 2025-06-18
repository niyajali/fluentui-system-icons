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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Connected: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Connected",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19f, 2f)
            curveTo(20.657f, 2f, 22f, 3.343f, 22f, 5f)
            curveTo(22f, 6.657f, 20.657f, 8f, 19f, 8f)
            curveTo(18.444f, 8f, 17.924f, 7.845f, 17.478f, 7.581f)
            lineTo(14.581f, 10.477f)
            curveTo(14.845f, 10.924f, 15f, 11.443f, 15f, 12f)
            curveTo(15f, 12.556f, 14.845f, 13.075f, 14.581f, 13.521f)
            lineTo(17.478f, 16.418f)
            curveTo(17.924f, 16.154f, 18.444f, 16f, 19f, 16f)
            curveTo(20.657f, 16f, 22f, 17.343f, 22f, 19f)
            curveTo(22f, 20.657f, 20.657f, 22f, 19f, 22f)
            curveTo(17.343f, 22f, 16f, 20.657f, 16f, 19f)
            curveTo(16f, 18.444f, 16.153f, 17.925f, 16.417f, 17.479f)
            lineTo(13.521f, 14.582f)
            curveTo(13.074f, 14.845f, 12.556f, 15f, 12f, 15f)
            curveTo(11.443f, 15f, 10.924f, 14.845f, 10.477f, 14.581f)
            lineTo(7.581f, 17.478f)
            curveTo(7.845f, 17.924f, 8f, 18.444f, 8f, 19f)
            curveTo(8f, 20.657f, 6.657f, 22f, 5f, 22f)
            curveTo(3.343f, 22f, 2f, 20.657f, 2f, 19f)
            curveTo(2f, 17.343f, 3.343f, 16f, 5f, 16f)
            curveTo(5.556f, 16f, 6.074f, 16.154f, 6.521f, 16.417f)
            lineTo(9.417f, 13.519f)
            curveTo(9.154f, 13.073f, 9f, 12.555f, 9f, 12f)
            curveTo(9f, 11.444f, 9.153f, 10.925f, 9.417f, 10.479f)
            lineTo(6.521f, 7.582f)
            curveTo(6.074f, 7.845f, 5.556f, 8f, 5f, 8f)
            curveTo(3.343f, 8f, 2f, 6.657f, 2f, 5f)
            curveTo(2f, 3.343f, 3.343f, 2f, 5f, 2f)
            curveTo(6.657f, 2f, 8f, 3.343f, 8f, 5f)
            curveTo(8f, 5.556f, 7.845f, 6.075f, 7.581f, 6.521f)
            lineTo(10.477f, 9.418f)
            curveTo(10.924f, 9.154f, 11.444f, 9f, 12f, 9f)
            curveTo(12.555f, 9f, 13.073f, 9.154f, 13.519f, 9.417f)
            lineTo(16.417f, 6.521f)
            curveTo(16.154f, 6.074f, 16f, 5.556f, 16f, 5f)
            curveTo(16f, 3.343f, 17.343f, 2f, 19f, 2f)
            close()
            moveTo(5f, 17.5f)
            curveTo(4.172f, 17.5f, 3.5f, 18.172f, 3.5f, 19f)
            curveTo(3.5f, 19.828f, 4.172f, 20.5f, 5f, 20.5f)
            curveTo(5.828f, 20.5f, 6.5f, 19.828f, 6.5f, 19f)
            curveTo(6.5f, 18.172f, 5.828f, 17.5f, 5f, 17.5f)
            close()
            moveTo(19f, 17.5f)
            curveTo(18.172f, 17.5f, 17.5f, 18.172f, 17.5f, 19f)
            curveTo(17.5f, 19.828f, 18.172f, 20.5f, 19f, 20.5f)
            curveTo(19.828f, 20.5f, 20.5f, 19.828f, 20.5f, 19f)
            curveTo(20.5f, 18.172f, 19.828f, 17.5f, 19f, 17.5f)
            close()
            moveTo(12f, 10.5f)
            curveTo(11.172f, 10.5f, 10.5f, 11.172f, 10.5f, 12f)
            curveTo(10.5f, 12.828f, 11.172f, 13.5f, 12f, 13.5f)
            curveTo(12.828f, 13.5f, 13.5f, 12.828f, 13.5f, 12f)
            curveTo(13.5f, 11.172f, 12.828f, 10.5f, 12f, 10.5f)
            close()
            moveTo(5f, 3.5f)
            curveTo(4.172f, 3.5f, 3.5f, 4.172f, 3.5f, 5f)
            curveTo(3.5f, 5.828f, 4.172f, 6.5f, 5f, 6.5f)
            curveTo(5.828f, 6.5f, 6.5f, 5.828f, 6.5f, 5f)
            curveTo(6.5f, 4.172f, 5.828f, 3.5f, 5f, 3.5f)
            close()
            moveTo(19f, 3.5f)
            curveTo(18.172f, 3.5f, 17.5f, 4.172f, 17.5f, 5f)
            curveTo(17.5f, 5.828f, 18.172f, 6.5f, 19f, 6.5f)
            curveTo(19.828f, 6.5f, 20.5f, 5.828f, 20.5f, 5f)
            curveTo(20.5f, 4.172f, 19.828f, 3.5f, 19f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ConnectedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Connected, contentDescription = null)
    }
}
