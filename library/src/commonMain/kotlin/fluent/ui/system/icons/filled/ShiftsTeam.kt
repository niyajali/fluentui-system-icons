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

public val FluentUi.Filled.ShiftsTeam: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShiftsTeam",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(12.759f)
            curveTo(12.926f, 20.618f, 13.004f, 20.213f, 13.004f, 19.813f)
            curveTo(13.004f, 18.893f, 12.467f, 18.081f, 11.677f, 17.712f)
            curveTo(12.185f, 17.213f, 12.5f, 16.518f, 12.5f, 15.75f)
            curveTo(12.5f, 14.231f, 11.269f, 13f, 9.75f, 13f)
            curveTo(9.012f, 13f, 8.342f, 13.291f, 7.848f, 13.764f)
            curveTo(7.43f, 12.451f, 6.201f, 11.5f, 4.75f, 11.5f)
            curveTo(4.106f, 11.5f, 3.505f, 11.688f, 3f, 12.011f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(11.75f, 6f)
            curveTo(11.336f, 6f, 11f, 6.336f, 11f, 6.75f)
            verticalLineTo(12.75f)
            curveTo(11f, 13.164f, 11.336f, 13.5f, 11.75f, 13.5f)
            horizontalLineTo(16.248f)
            curveTo(16.663f, 13.5f, 16.998f, 13.164f, 16.998f, 12.75f)
            curveTo(16.998f, 12.336f, 16.663f, 12f, 16.248f, 12f)
            horizontalLineTo(12.5f)
            verticalLineTo(6.75f)
            curveTo(12.5f, 6.336f, 12.164f, 6f, 11.75f, 6f)
            close()
            moveTo(4.75f, 17f)
            curveTo(5.993f, 17f, 7f, 15.993f, 7f, 14.75f)
            curveTo(7f, 13.507f, 5.993f, 12.5f, 4.75f, 12.5f)
            curveTo(3.507f, 12.5f, 2.5f, 13.507f, 2.5f, 14.75f)
            curveTo(2.5f, 15.993f, 3.507f, 17f, 4.75f, 17f)
            close()
            moveTo(4.75f, 23f)
            curveTo(7.429f, 23f, 8.5f, 21.431f, 8.5f, 19.875f)
            curveTo(8.5f, 18.84f, 7.78f, 18f, 6.893f, 18f)
            horizontalLineTo(2.607f)
            curveTo(1.72f, 18f, 1f, 18.84f, 1f, 19.875f)
            curveTo(1f, 21.437f, 2.071f, 23f, 4.75f, 23f)
            close()
            moveTo(11.5f, 15.75f)
            curveTo(11.5f, 16.716f, 10.717f, 17.5f, 9.75f, 17.5f)
            curveTo(8.783f, 17.5f, 8f, 16.716f, 8f, 15.75f)
            curveTo(8f, 14.783f, 8.783f, 14f, 9.75f, 14f)
            curveTo(10.717f, 14f, 11.5f, 14.783f, 11.5f, 15.75f)
            close()
            moveTo(8.916f, 21.999f)
            curveTo(9.32f, 21.34f, 9.498f, 20.595f, 9.498f, 19.875f)
            curveTo(9.498f, 19.399f, 9.386f, 18.924f, 9.178f, 18.5f)
            horizontalLineTo(10.719f)
            curveTo(11.429f, 18.5f, 12.004f, 19.088f, 12.004f, 19.813f)
            curveTo(12.004f, 20.902f, 11.147f, 22f, 9.004f, 22f)
            curveTo(8.975f, 22f, 8.945f, 22f, 8.916f, 21.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShiftsTeamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShiftsTeam, contentDescription = null)
    }
}
