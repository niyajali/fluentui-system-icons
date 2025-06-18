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

public val FluentUi.Filled.ConferenceRoom: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ConferenceRoom",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.598f, 2.01f)
            lineTo(19.598f, 4.01f)
            curveTo(19.832f, 4.057f, 20f, 4.262f, 20f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(20f, 19.739f, 19.832f, 19.944f, 19.598f, 19.99f)
            lineTo(10.598f, 21.99f)
            curveTo(10.289f, 22.052f, 10f, 21.816f, 10f, 21.5f)
            verticalLineTo(2.5f)
            curveTo(10f, 2.185f, 10.289f, 1.948f, 10.598f, 2.01f)
            close()
            moveTo(9f, 4f)
            verticalLineTo(20f)
            horizontalLineTo(4.75f)
            curveTo(4.37f, 20f, 4.057f, 19.718f, 4.007f, 19.352f)
            lineTo(4f, 19.25f)
            verticalLineTo(4.75f)
            curveTo(4f, 4.37f, 4.282f, 4.057f, 4.648f, 4.007f)
            lineTo(4.75f, 4f)
            horizontalLineTo(9f)
            close()
            moveTo(13f, 11f)
            curveTo(12.448f, 11f, 12f, 11.448f, 12f, 12f)
            curveTo(12f, 12.552f, 12.448f, 13f, 13f, 13f)
            curveTo(13.552f, 13f, 14f, 12.552f, 14f, 12f)
            curveTo(14f, 11.448f, 13.552f, 11f, 13f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ConferenceRoomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ConferenceRoom, contentDescription = null)
    }
}
