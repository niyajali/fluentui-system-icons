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

public val FluentUi.Filled.TextPositionBehind: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextPositionBehind",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 3.75f)
            curveTo(3.198f, 3.75f, 2.75f, 4.198f, 2.75f, 4.75f)
            curveTo(2.75f, 5.302f, 3.198f, 5.75f, 3.75f, 5.75f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 5.75f, 21.25f, 5.302f, 21.25f, 4.75f)
            curveTo(21.25f, 4.198f, 20.802f, 3.75f, 20.25f, 3.75f)
            horizontalLineTo(3.75f)
            close()
            moveTo(10.75f, 11f)
            curveTo(10.75f, 10.914f, 10.759f, 10.831f, 10.775f, 10.75f)
            horizontalLineTo(13.225f)
            curveTo(13.241f, 10.831f, 13.25f, 10.914f, 13.25f, 11f)
            verticalLineTo(12.75f)
            horizontalLineTo(10.75f)
            verticalLineTo(11f)
            close()
            moveTo(14.236f, 10.75f)
            curveTo(14.245f, 10.832f, 14.25f, 10.915f, 14.25f, 11f)
            verticalLineTo(15.75f)
            curveTo(14.25f, 16.302f, 14.698f, 16.75f, 15.25f, 16.75f)
            curveTo(15.802f, 16.75f, 16.25f, 16.302f, 16.25f, 15.75f)
            verticalLineTo(11f)
            curveTo(16.25f, 10.916f, 16.248f, 10.833f, 16.243f, 10.75f)
            curveTo(16.113f, 8.519f, 14.263f, 6.75f, 12f, 6.75f)
            curveTo(9.737f, 6.75f, 7.887f, 8.519f, 7.757f, 10.75f)
            curveTo(7.752f, 10.833f, 7.75f, 10.916f, 7.75f, 11f)
            verticalLineTo(15.75f)
            curveTo(7.75f, 16.302f, 8.198f, 16.75f, 8.75f, 16.75f)
            curveTo(9.302f, 16.75f, 9.75f, 16.302f, 9.75f, 15.75f)
            verticalLineTo(11f)
            curveTo(9.75f, 10.915f, 9.755f, 10.832f, 9.764f, 10.75f)
            curveTo(9.888f, 9.625f, 10.842f, 8.75f, 12f, 8.75f)
            curveTo(13.158f, 8.75f, 14.112f, 9.625f, 14.236f, 10.75f)
            close()
            moveTo(20.25f, 12.75f)
            horizontalLineTo(17.25f)
            verticalLineTo(11f)
            curveTo(17.25f, 10.916f, 17.248f, 10.833f, 17.244f, 10.75f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 10.75f, 21.25f, 11.198f, 21.25f, 11.75f)
            curveTo(21.25f, 12.302f, 20.802f, 12.75f, 20.25f, 12.75f)
            close()
            moveTo(6.75f, 11f)
            curveTo(6.75f, 10.916f, 6.752f, 10.833f, 6.756f, 10.75f)
            horizontalLineTo(3.75f)
            curveTo(3.198f, 10.75f, 2.75f, 11.198f, 2.75f, 11.75f)
            curveTo(2.75f, 12.302f, 3.198f, 12.75f, 3.75f, 12.75f)
            horizontalLineTo(6.75f)
            verticalLineTo(11f)
            close()
            moveTo(2.75f, 18.75f)
            curveTo(2.75f, 18.198f, 3.198f, 17.75f, 3.75f, 17.75f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 17.75f, 21.25f, 18.198f, 21.25f, 18.75f)
            curveTo(21.25f, 19.302f, 20.802f, 19.75f, 20.25f, 19.75f)
            horizontalLineTo(3.75f)
            curveTo(3.198f, 19.75f, 2.75f, 19.302f, 2.75f, 18.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextPositionBehindPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextPositionBehind, contentDescription = null)
    }
}
