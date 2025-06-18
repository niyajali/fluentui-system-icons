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

public val FluentIcons.Filled.PhoneVerticalScroll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneVerticalScroll",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
            moveTo(13.714f, 13.475f)
            lineTo(12f, 15.225f)
            lineTo(10.282f, 13.475f)
            curveTo(9.992f, 13.179f, 9.517f, 13.175f, 9.222f, 13.465f)
            curveTo(8.926f, 13.755f, 8.922f, 14.23f, 9.212f, 14.525f)
            lineTo(11.465f, 16.821f)
            curveTo(11.759f, 17.121f, 12.242f, 17.121f, 12.536f, 16.821f)
            lineTo(14.786f, 14.525f)
            curveTo(15.076f, 14.229f, 15.071f, 13.754f, 14.775f, 13.464f)
            curveTo(14.479f, 13.174f, 14.004f, 13.179f, 13.714f, 13.475f)
            close()
            moveTo(14.786f, 9.521f)
            lineTo(12.536f, 7.225f)
            curveTo(12.268f, 6.952f, 11.845f, 6.927f, 11.549f, 7.15f)
            lineTo(11.465f, 7.225f)
            lineTo(9.212f, 9.52f)
            curveTo(8.922f, 9.816f, 8.926f, 10.291f, 9.222f, 10.581f)
            curveTo(9.491f, 10.845f, 9.907f, 10.865f, 10.199f, 10.644f)
            lineTo(10.282f, 10.571f)
            lineTo(12f, 8.821f)
            lineTo(13.714f, 10.571f)
            curveTo(14.004f, 10.867f, 14.479f, 10.871f, 14.775f, 10.581f)
            curveTo(15.044f, 10.318f, 15.072f, 9.901f, 14.857f, 9.606f)
            lineTo(14.786f, 9.521f)
            lineTo(12.536f, 7.225f)
            lineTo(14.786f, 9.521f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneVerticalScrollPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PhoneVerticalScroll, contentDescription = null)
    }
}
