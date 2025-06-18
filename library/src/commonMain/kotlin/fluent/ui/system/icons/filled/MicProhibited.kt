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

public val FluentIcons.Filled.MicProhibited: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MicProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.175f, 15.996f)
            curveTo(11.658f, 13.958f, 13.101f, 12.29f, 15f, 11.498f)
            verticalLineTo(6f)
            curveTo(15f, 3.791f, 13.209f, 2f, 11f, 2f)
            curveTo(8.791f, 2f, 7f, 3.791f, 7f, 6f)
            verticalLineTo(12f)
            curveTo(7f, 14.209f, 8.791f, 16f, 11f, 16f)
            curveTo(11.059f, 16f, 11.117f, 15.999f, 11.175f, 15.996f)
            close()
            moveTo(11f, 17.5f)
            curveTo(11f, 18.596f, 11.271f, 19.629f, 11.75f, 20.535f)
            lineTo(11.75f, 21.25f)
            curveTo(11.75f, 21.664f, 11.414f, 22f, 11f, 22f)
            curveTo(10.62f, 22f, 10.307f, 21.718f, 10.257f, 21.352f)
            lineTo(10.25f, 21.25f)
            lineTo(10.25f, 18.982f)
            curveTo(6.833f, 18.732f, 4.123f, 15.938f, 4.004f, 12.486f)
            lineTo(4f, 12.25f)
            verticalLineTo(11.75f)
            curveTo(4f, 11.336f, 4.336f, 11f, 4.75f, 11f)
            curveTo(5.13f, 11f, 5.443f, 11.282f, 5.493f, 11.648f)
            lineTo(5.5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(5.5f, 15.077f, 7.734f, 17.382f, 10.534f, 17.496f)
            lineTo(10.75f, 17.5f)
            horizontalLineTo(11f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(13.5f, 17.5f)
            curveTo(13.5f, 18.333f, 13.755f, 19.108f, 14.191f, 19.748f)
            lineTo(19.748f, 14.191f)
            curveTo(19.108f, 13.755f, 18.333f, 13.5f, 17.5f, 13.5f)
            curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
            close()
            moveTo(17.5f, 21.5f)
            curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
            curveTo(21.5f, 16.667f, 21.245f, 15.892f, 20.809f, 15.252f)
            lineTo(15.252f, 20.809f)
            curveTo(15.892f, 21.245f, 16.667f, 21.5f, 17.5f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MicProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MicProhibited, contentDescription = null)
    }
}
