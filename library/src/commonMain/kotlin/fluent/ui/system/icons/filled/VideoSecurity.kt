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

public val FluentIcons.Filled.VideoSecurity: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoSecurity",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(13.75f)
            curveTo(15.545f, 3f, 17f, 4.455f, 17f, 6.25f)
            verticalLineTo(12.75f)
            curveTo(17f, 14.545f, 15.545f, 16f, 13.75f, 16f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 16f, 2f, 14.545f, 2f, 12.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(21.619f, 3.597f)
            curveTo(21.855f, 3.73f, 22f, 3.98f, 22f, 4.25f)
            verticalLineTo(14.75f)
            curveTo(22f, 15.02f, 21.855f, 15.269f, 21.619f, 15.403f)
            curveTo(21.384f, 15.536f, 21.096f, 15.532f, 20.864f, 15.393f)
            lineTo(18f, 13.675f)
            verticalLineTo(5.325f)
            lineTo(20.864f, 3.607f)
            curveTo(21.096f, 3.468f, 21.384f, 3.464f, 21.619f, 3.597f)
            close()
            moveTo(8.136f, 17f)
            curveTo(7.817f, 18.014f, 6.869f, 18.75f, 5.75f, 18.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 18.75f, 3f, 19.086f, 3f, 19.5f)
            verticalLineTo(21.1f)
            curveTo(3f, 21.597f, 3.403f, 22f, 3.9f, 22f)
            horizontalLineTo(5.844f)
            curveTo(8.849f, 22f, 11.351f, 19.847f, 11.892f, 17f)
            horizontalLineTo(8.136f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoSecurityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoSecurity, contentDescription = null)
    }
}
